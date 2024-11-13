package com.ruoyi.system.service.impl;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.ruoyi.common.config.RuoYiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysGenomeListMapper;
import com.ruoyi.system.domain.SysGenomeList;
import com.ruoyi.system.service.ISysGenomeListService;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-05-07
 */
@Service
public class SysGenomeListServiceImpl implements ISysGenomeListService
{
    @Autowired
    private SysGenomeListMapper sysGenomeListMapper;
    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public synchronized  int gupload(String mail, MultipartFile inputFile) throws IOException, MessagingException  {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String uploadTime = date.format(formatter).toString();
//        int test = sysGenomeListMapper.limitMail(mail,uploadTime);
//        if(test > 0 ){
//            return 1 ;
//        }
        //获取文件名
        String filename = inputFile.getOriginalFilename();
        //获取当前时间戳
        String dateString = Long.toString(System.currentTimeMillis());
        //对文件进行重命名：当前时间戳+原始文件名+后缀
        String fileName = dateString + filename;
        //文件存储路径
        String path = RuoYiConfig.getProdigalPath() + "\\input";
        //创建一个新的文件对象，表示文件需要保存的路径和文件名
        File f = new File(new File(path), fileName);
        //保存文件
        inputFile.transferTo(f);
        //输出文件名称
        String  result = RuoYiConfig.getProdigalPath() + "\\output\\" + fileName;
        //基因组执行Prodigal
        try {
            //指定文件夹
            File workingDir = new File(RuoYiConfig.getProdigalPath());
            //拼接cmd命令
            String command = "prodigal -a output/" + fileName + " -i input/" + fileName;

            //执行cmd 命令
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
            //指定输出文件路径
            File outputFile = new File(result);
            //进入文件目录
            builder.directory(workingDir);
            //输出文件到指定位置
            builder.redirectOutput(outputFile);
            //进入文件目录
            builder.directory(workingDir);
            //执行命令
            Process process = builder.start();
            //等待执行完毕
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }


        //将prodigal执行后的输出文件执行hmmmer
        //输出文件名称
        String resulturl = RuoYiConfig.getProdigalPath() + "\\result\\" + fileName.substring(0,fileName.length()-5) + "out" ;
        String inputurl = RuoYiConfig.getProdigalPath() + "\\output\\" + fileName;










        try {
            //指定文件夹
            File workingDirh = new File(RuoYiConfig.getHmmerPath());
            //拼接cmd命令
            String commandh = "hmmsearch -E 1e-5 --tblout " + resulturl + " --noali --notextw  " + "database\\combined-database.hmm " + inputurl ;

            System.out.println(commandh);

            // 创建文件输入流和输出流
            FileInputStream fis = new FileInputStream(new File(inputurl));
            BufferedReader input = new BufferedReader(new InputStreamReader(fis));
            FileOutputStream fos = new FileOutputStream(new File(resulturl));
            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(fos));
            //执行cmd 命令
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", commandh);
            //进入文件目录
            builder.directory(workingDirh);
            // 重定向标准输出流和标准错误流
            builder.redirectOutput(new File("NUL"));
            builder.redirectError(new File("NUL"));
            System.out.println("&&&&&&");
            // 获取命令的标准输出流
            Process process = builder.start();
            // 等待命令执行完毕
            process.waitFor();
            InputStream stdout = process.getInputStream();
            BufferedReader stdoutReader = new BufferedReader(new InputStreamReader(stdout));
            //将命令的输出写入文件
            String line;
            while ((line = stdoutReader.readLine()) != null) {
                output.write(line);
                output.newLine();
            }
            //关闭文件输入流和输出流
            input.close();
            output.close();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }











        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        // 设置邮件主题、发送人和收件人
        helper.setSubject("Genome list matching results!");
        helper.setFrom("1420889454@qq.com");
        helper.setTo(mail);
        // 设置邮件内容
        helper.setText("The genome list you uploaded has been successfully matched!");
        // 添加附件
        FileSystemResource file = new FileSystemResource(new File(resulturl));
        helper.addAttachment(resulturl, file);
        // 发送邮件
        javaMailSender.send(message);
        //数据插入
        SysGenomeList sysGenomeList = new SysGenomeList();
        sysGenomeList.setMailCount(mail);
        sysGenomeList.setInputFastap(RuoYiConfig.getProdigalPath() + "\\input\\" + fileName);
        sysGenomeList.setResultFastap(RuoYiConfig.getProdigalPath() + "\\output\\" + fileName);
        sysGenomeList.setInputFastah(RuoYiConfig.getProdigalPath() + "\\output\\" + fileName) ;
        sysGenomeList.setResultFastah(RuoYiConfig.getHmmerPath() + "\result\\" + resulturl);
        sysGenomeList.setIsMail("1");
        sysGenomeList.setResultDetail(uploadTime);

        if(sysGenomeListMapper.insertSysGenomeList(sysGenomeList) == 1){
            return 1 ;
        }else{
            return 0;
        }
    }
    /**
     * 查询【请填写功能名称】
     *
     * @param genomeId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysGenomeList selectSysGenomeListByGenomeId(Long genomeId)
    {
        return sysGenomeListMapper.selectSysGenomeListByGenomeId(genomeId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysGenomeList> selectSysGenomeListList(SysGenomeList sysGenomeList)
    {
        return sysGenomeListMapper.selectSysGenomeListList(sysGenomeList);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysGenomeList(SysGenomeList sysGenomeList)
    {
        return sysGenomeListMapper.insertSysGenomeList(sysGenomeList);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysGenomeList(SysGenomeList sysGenomeList)
    {
        return sysGenomeListMapper.updateSysGenomeList(sysGenomeList);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param genomeIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysGenomeListByGenomeIds(Long[] genomeIds)
    {
        return sysGenomeListMapper.deleteSysGenomeListByGenomeIds(genomeIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param genomeId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysGenomeListByGenomeId(Long genomeId)
    {
        return sysGenomeListMapper.deleteSysGenomeListByGenomeId(genomeId);
    }


}
