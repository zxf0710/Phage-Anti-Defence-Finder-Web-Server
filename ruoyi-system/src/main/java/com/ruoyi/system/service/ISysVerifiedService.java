package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysVerified;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
public interface ISysVerifiedService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param verifiedId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysVerified selectSysVerifiedByVerifiedId(Long verifiedId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysVerified> selectSysVerifiedList(SysVerified sysVerified);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 结果
     */
    public int insertSysVerified(SysVerified sysVerified);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 结果
     */
    public int updateSysVerified(SysVerified sysVerified);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param verifiedIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysVerifiedByVerifiedIds(Long[] verifiedIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param verifiedId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysVerifiedByVerifiedId(Long verifiedId);

    /**
     * 条件查询列表
     *
     * @param sysVerified 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysVerified> selectList(SysVerified sysVerified);

    public List<SysVerified> selectSortList(SysVerified sysVerified);

    public List<SysVerified> mhselectList(String condition);
}
