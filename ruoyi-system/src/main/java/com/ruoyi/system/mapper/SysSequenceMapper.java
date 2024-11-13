package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysSequence;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-27
 */
public interface SysSequenceMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param fileId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysSequence selectSysSequenceByFileId(Long fileId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysSequence 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysSequence> selectSysSequenceList(SysSequence sysSequence);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysSequence 【请填写功能名称】
     * @return 结果
     */
    public int insertSysSequence(SysSequence sysSequence);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysSequence 【请填写功能名称】
     * @return 结果
     */
    public int updateSysSequence(SysSequence sysSequence);

    /**
     * 删除【请填写功能名称】
     * 
     * @param fileId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysSequenceByFileId(Long fileId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param fileIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysSequenceByFileIds(Long[] fileIds);
}
