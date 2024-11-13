package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysVdetail;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
public interface ISysVdetailService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param verifiedDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysVdetail selectSysVdetailByVerifiedDetailId(Long verifiedDetailId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysVdetail> selectSysVdetailList(SysVdetail sysVdetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 结果
     */
    public int insertSysVdetail(SysVdetail sysVdetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 结果
     */
    public int updateSysVdetail(SysVdetail sysVdetail);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param verifiedDetailIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysVdetailByVerifiedDetailIds(Long[] verifiedDetailIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param verifiedDetailId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysVdetailByVerifiedDetailId(Long verifiedDetailId);

    //根据蛋白质id查询详细信息
    public SysVdetail selectSysVdetailByProteinIds(String proteinIds);
}
