package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SysAnti;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2024-10-21
 */
public interface ISysAntiService
{
    /**
     * 查询【请填写功能名称】
     *
     * @param antiId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SysAnti selectSysAntiByAntiId(Long antiId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysAnti 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SysAnti> selectSysAntiList(SysAnti sysAnti);

    /**
     * 新增【请填写功能名称】
     *
     * @param sysAnti 【请填写功能名称】
     * @return 结果
     */
    public int insertSysAnti(SysAnti sysAnti);

    /**
     * 修改【请填写功能名称】
     *
     * @param sysAnti 【请填写功能名称】
     * @return 结果
     */
    public int updateSysAnti(SysAnti sysAnti);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param antiIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSysAntiByAntiIds(Long[] antiIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param antiId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSysAntiByAntiId(Long antiId);

    public List<SysAnti> mhselectList(String condition);
}
