package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SysPdetail;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
public interface SysPdetailMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param predictedDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysPdetail selectSysPdetailByPredictedDetailId(Long predictedDetailId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysPdetail> selectSysPdetailList(SysPdetail sysPdetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 结果
     */
    public int insertSysPdetail(SysPdetail sysPdetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 结果
     */
    public int updateSysPdetail(SysPdetail sysPdetail);

    /**
     * 删除【请填写功能名称】
     * 
     * @param predictedDetailId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysPdetailByPredictedDetailId(Long predictedDetailId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param predictedDetailIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysPdetailByPredictedDetailIds(Long[] predictedDetailIds);



    //根据蛋白质id查询详细信息
    public SysPdetail selectSysPdetailByProteinIds(String proteinIds);

}
