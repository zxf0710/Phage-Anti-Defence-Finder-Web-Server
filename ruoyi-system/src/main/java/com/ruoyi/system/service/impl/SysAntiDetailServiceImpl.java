package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysAntiDetailMapper;
import com.ruoyi.system.domain.SysAntiDetail;
import com.ruoyi.system.service.ISysAntiDetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-10-21
 */
@Service
public class SysAntiDetailServiceImpl implements ISysAntiDetailService 
{
    @Autowired
    private SysAntiDetailMapper sysAntiDetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param antiDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysAntiDetail selectSysAntiDetailByAntiDetailId(Long antiDetailId)
    {
        return sysAntiDetailMapper.selectSysAntiDetailByAntiDetailId(antiDetailId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysAntiDetail> selectSysAntiDetailList(SysAntiDetail sysAntiDetail)
    {
        return sysAntiDetailMapper.selectSysAntiDetailList(sysAntiDetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysAntiDetail(SysAntiDetail sysAntiDetail)
    {
        return sysAntiDetailMapper.insertSysAntiDetail(sysAntiDetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysAntiDetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysAntiDetail(SysAntiDetail sysAntiDetail)
    {
        return sysAntiDetailMapper.updateSysAntiDetail(sysAntiDetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param antiDetailIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysAntiDetailByAntiDetailIds(Long[] antiDetailIds)
    {
        return sysAntiDetailMapper.deleteSysAntiDetailByAntiDetailIds(antiDetailIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param antiDetailId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysAntiDetailByAntiDetailId(Long antiDetailId)
    {
        return sysAntiDetailMapper.deleteSysAntiDetailByAntiDetailId(antiDetailId);
    }
}
