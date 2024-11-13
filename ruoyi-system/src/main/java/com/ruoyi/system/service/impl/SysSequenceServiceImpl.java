package com.ruoyi.system.service.impl;


import java.io.*;
import java.util.List;

import com.ruoyi.common.config.RuoYiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysSequenceMapper;
import com.ruoyi.system.domain.SysSequence;
import com.ruoyi.system.service.ISysSequenceService;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2023-04-27
 */
@Service
public class SysSequenceServiceImpl implements ISysSequenceService
{
    @Autowired
    private SysSequenceMapper sysSequenceMapper;
    @Autowired
    private JavaMailSender javaMailSender;
//    本机测试


    @Override
    public int upload(String mail, MultipartFile inputFile) throws IOException, MessagingException {
        //获取文件名
        String filename = inputFile.getOriginalFilename();
        //获取当前时间戳
        String dateString = Long.toString(System.currentTimeMillis());
        //对文件进行重命名：当前时间戳+原始文件名+后缀
        String fileName = dateString + filename;

        //文件存储路径
        String path = RuoYiConfig.getHmmerPath() + "\\input";
        //创建一个新的文件对象，表示文件需要保存的路径和文件名
        File f = new File(new File(path), fileName);
        //保存文件
        inputFile.transferTo(f);
        //输出文件名
        String result = fileName.substring(0,fileName.length()-5);
        //输出文件名称
        String resulturl = result + "out" ;

        //输出文件路径
        result = RuoYiConfig.getHmmerPath() + "\\result\\" + resulturl ;


        //指定文件夹
        File workingDir = new File(RuoYiConfig.getHmmerPath());
        //拼接cmd命令

        String command = "hmmsearch -E 1e-5 --tblout result\\" + resulturl + " --noali --notextw "  + "  database\\combined-database.hmm" + " input\\" + fileName ;
        //指定输出文件路径
        System.out.println(command);
        //执行cmd 命令
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", command);
        //进入文件目录
        builder.directory(workingDir);

        Process process = builder.start();

        try {
            //获取进程的标准输入流
            final InputStream is1 = process.getInputStream();
            //获取进城的错误流
            final InputStream is2 = process.getErrorStream();
            //启动两个线程，一个线程负责读标准输出流，另一个负责读标准错误流
            new Thread() {
                public void run() {
                    BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
                    try {
                        String line1 = null;
                        while ((line1 = br1.readLine()) != null) {
                            if (line1 != null){}
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally{
                        try {
                            is1.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();

            new Thread() {
                public void  run() {
                    BufferedReader br2 = new  BufferedReader(new  InputStreamReader(is2));
                    try {
                        String line2 = null ;
                        while ((line2 = br2.readLine()) !=  null ) {
                            if (line2 != null){}
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally{
                        try {
                            is2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }.start();
            //等待执行完毕
            process.waitFor();
            process.destroy();

        } catch (Exception e) {
            process.getErrorStream().close();
            process.getInputStream().close();
            process.getOutputStream().close();
            e.printStackTrace();
        }


















        SysSequence sysSequence = new SysSequence();
        String inputurl = RuoYiConfig.getHmmerPath() + "\\input\\" + fileName;
        String outputurl = result;
        sysSequence.setMailCount(mail);
        sysSequence.setInputFasta(inputurl);
        sysSequence.setResultFasta(outputurl);
        sysSequence.setIsMail("1");


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        // 设置邮件主题、发送人和收件人
        helper.setSubject("Protein sequence matching results!");
        helper.setFrom("1420889454@qq.com");
        helper.setTo(mail);
        // 设置邮件内容
        helper.setText("The protein sequence you uploaded has been successfully matched!");
        // 添加附件
        FileSystemResource file = new FileSystemResource(new File(result));
        helper.addAttachment(resulturl, file);
        // 发送邮件
        javaMailSender.send(message);


        if(sysSequenceMapper.insertSysSequence(sysSequence) == 1){
            return 1 ;
        }else{
            return 0;
        }
    }
//
//    public int upload(String mail, MultipartFile inputFile) throws IOException, MessagingException {
//        // 获取文件名和时间戳
//        String originalFilename = inputFile.getOriginalFilename();
//        String timestamp = Long.toString(System.currentTimeMillis());
//
//        // 构建文件路径和重命名文件
//        String inputPath = RuoYiConfig.getHmmerPath() + File.separator + "input";
//        String outputPath = RuoYiConfig.getHmmerPath() + File.separator + "result";
//        String inputFileName = timestamp + "_" + originalFilename;
//        String outputFileName = timestamp + "_output.out";
//
//        // 创建文件对象
//        File inputFileDir = new File(inputPath);
//        if (!inputFileDir.exists()) {
//            inputFileDir.mkdirs();
//        }
//        File inputFileObj = new File(inputFileDir, inputFileName);
//        File outputFileObj = new File(outputPath, outputFileName);
//
//        // 保存上传的文件
//        inputFile.transferTo(inputFileObj);
//
//        // 构建并执行HMMER命令
//        String hmmsearchCommand = String.format(
//                "hmmsearch -E 1e-5 --tblout %s --noali --notextw %s %s",
//                outputFileObj.getAbsolutePath(),
//                new File(RuoYiConfig.getHmmerPath(), "database/combined-database.hmm").getAbsolutePath(),
//                inputFileObj.getAbsolutePath()
//        );
//        System.out.println("Executing command: " + hmmsearchCommand);
//
//        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", hmmsearchCommand);
//        builder.directory(new File(RuoYiConfig.getHmmerPath()));
//        Process process = builder.start();
//        int exitCode = 0;
//        try {
//            exitCode = process.waitFor();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//            // Handle interruption if needed
//        }
//
//        if (exitCode != 0) {
//            // Handle error if hmmsearch exits with a non-zero status
//            System.err.println("HMMER command failed with exit code: " + exitCode);
//            return -1; // Or some other error code
//        }
//
//        // 准备邮件发送
//        SysSequence sysSequence = new SysSequence();
//        sysSequence.setMailCount(mail);
//        sysSequence.setInputFasta(inputFileObj.getAbsolutePath());
//        sysSequence.setResultFasta(outputFileObj.getAbsolutePath());
//        sysSequence.setIsMail("1");
//
//        // 发送邮件
//        MimeMessage message = javaMailSender.createMimeMessage();
//        MimeMessageHelper helper = new MimeMessageHelper(message, true);
//        helper.setSubject("Protein sequence matching results!");
//        helper.setFrom("1420889454@qq.com");
//        helper.setTo(mail);
//        helper.setText("The protein sequence you uploaded has been successfully matched!");
//        helper.addAttachment(outputFileName, new FileSystemResource(outputFileObj));
//        javaMailSender.send(message);
//
//        // 保存记录到数据库
//        if (sysSequenceMapper.insertSysSequence(sysSequence) == 1) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }







    /**
     * 查询【请填写功能名称】
     *
     * @param fileId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysSequence selectSysSequenceByFileId(Long fileId)
    {
        return sysSequenceMapper.selectSysSequenceByFileId(fileId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysSequence 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysSequence> selectSysSequenceList(SysSequence sysSequence)
    {
        return sysSequenceMapper.selectSysSequenceList(sysSequence);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sysSequence 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysSequence(SysSequence sysSequence)
    {
        return sysSequenceMapper.insertSysSequence(sysSequence);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sysSequence 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysSequence(SysSequence sysSequence)
    {
        return sysSequenceMapper.updateSysSequence(sysSequence);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param fileIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysSequenceByFileIds(Long[] fileIds)
    {
        return sysSequenceMapper.deleteSysSequenceByFileIds(fileIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param fileId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysSequenceByFileId(Long fileId)
    {
        return sysSequenceMapper.deleteSysSequenceByFileId(fileId);
    }

}
