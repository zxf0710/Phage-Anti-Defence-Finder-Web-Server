package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPhageGenome;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
public interface SysPhageGenomeMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param phageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysPhageGenome selectSysPhageGenomeByPhageId(Long phageId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPhageGenome> selectSysPhageGenomeList(SysPhageGenome sysPhageGenome);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPhageGenome(SysPhageGenome sysPhageGenome);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPhageGenome(SysPhageGenome sysPhageGenome);

    /**
     * 删除【请填写功能名称】
     * 
     * @param phageId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPhageGenomeByPhageId(Long phageId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param phageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysPhageGenomeByPhageIds(Long[] phageIds);

    /**
     * 列表排序
     *
     * @param sysPhageGenome 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPhageGenome> selectSortList(SysPhageGenome sysPhageGenome);


    public List<SysPhageGenome> mhselectList(String condition);

}
