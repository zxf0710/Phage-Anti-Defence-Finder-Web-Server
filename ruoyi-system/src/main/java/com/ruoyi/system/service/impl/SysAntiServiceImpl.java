package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAntiMapper;
import com.ruoyi.system.domain.SysAnti;
import com.ruoyi.system.service.ISysAntiService;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-10-21
 */
@Service
public class SysAntiServiceImpl implements ISysAntiService
{
    @Autowired
    private SysAntiMapper sysAntiMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param antiId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysAnti selectSysAntiByAntiId(Long antiId)
    {
        return sysAntiMapper.selectSysAntiByAntiId(antiId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param sysAnti 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysAnti> selectSysAntiList(SysAnti sysAnti)
    {
        return sysAntiMapper.selectSysAntiList(sysAnti);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param sysAnti 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysAnti(SysAnti sysAnti)
    {
        return sysAntiMapper.insertSysAnti(sysAnti);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param sysAnti 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysAnti(SysAnti sysAnti)
    {
        return sysAntiMapper.updateSysAnti(sysAnti);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param antiIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysAntiByAntiIds(Long[] antiIds)
    {
        return sysAntiMapper.deleteSysAntiByAntiIds(antiIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param antiId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysAntiByAntiId(Long antiId)
    {
        return sysAntiMapper.deleteSysAntiByAntiId(antiId);
    }

    @Override
    public List<SysAnti> mhselectList(String condition) {
        return sysAntiMapper.mhselectList(condition);
    }
}
