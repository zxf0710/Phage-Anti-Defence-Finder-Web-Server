package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPredicted;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
public interface SysPredictedMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param predictedId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysPredicted selectSysPredictedByPredictedId(Long predictedId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPredicted> selectSysPredictedList(SysPredicted sysPredicted);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPredicted(SysPredicted sysPredicted);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPredicted(SysPredicted sysPredicted);

    /**
     * 删除【请填写功能名称】
     * 
     * @param predictedId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPredictedByPredictedId(Long predictedId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param predictedIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysPredictedByPredictedIds(Long[] predictedIds);


    /**
     * 条件查询列表
     *
     * @param sysPredicted 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPredicted> selectList(SysPredicted sysPredicted);

    /**
     * 列表排序
     *
     * @param sysPredicted 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPredicted> selectSortList(SysPredicted sysPredicted);

    /**
     * 模糊查询
     */
    public List<SysPredicted> mhselectList(String condition);

}
