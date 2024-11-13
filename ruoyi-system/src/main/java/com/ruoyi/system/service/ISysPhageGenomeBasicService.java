package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysPhageGenomeBasic;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public interface ISysPhageGenomeBasicService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param basicId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysPhageGenomeBasic selectSysPhageGenomeBasicByBasicId(Long basicId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPhageGenomeBasic> selectSysPhageGenomeBasicList(SysPhageGenomeBasic sysPhageGenomeBasic);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPhageGenomeBasic(SysPhageGenomeBasic sysPhageGenomeBasic);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPhageGenomeBasic(SysPhageGenomeBasic sysPhageGenomeBasic);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param basicIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysPhageGenomeBasicByBasicIds(Long[] basicIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param basicId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPhageGenomeBasicByBasicId(Long basicId);
}
