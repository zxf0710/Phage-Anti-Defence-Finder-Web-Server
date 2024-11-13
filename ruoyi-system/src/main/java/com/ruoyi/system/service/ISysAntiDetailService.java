package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAntiDetail;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-10-21
 */
public interface ISysAntiDetailService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param antiDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysAntiDetail selectSysAntiDetailByAntiDetailId(Long antiDetailId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysAntiDetail> selectSysAntiDetailList(SysAntiDetail sysAntiDetail);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 结果
     */
    public int insertSysAntiDetail(SysAntiDetail sysAntiDetail);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 结果
     */
    public int updateSysAntiDetail(SysAntiDetail sysAntiDetail);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param antiDetailIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysAntiDetailByAntiDetailIds(Long[] antiDetailIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param antiDetailId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysAntiDetailByAntiDetailId(Long antiDetailId);
}
