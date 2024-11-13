package com.ruoyi.system.service;

import java.io.IOException;
import java.util.List;
import com.ruoyi.system.domain.SysGenomeList;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2023-05-07
 */
public interface ISysGenomeListService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param genomeId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysGenomeList selectSysGenomeListByGenomeId(Long genomeId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysGenomeList> selectSysGenomeListList(SysGenomeList sysGenomeList);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 结果
     */
    public int insertSysGenomeList(SysGenomeList sysGenomeList);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysGenomeList 【请填写功能名称】
     * @return 结果
     */
    public int updateSysGenomeList(SysGenomeList sysGenomeList);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param genomeIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysGenomeListByGenomeIds(Long[] genomeIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param genomeId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysGenomeListByGenomeId(Long genomeId);

    public int gupload(String mail, MultipartFile inputFile) throws IOException, MessagingException, InterruptedException;

}
