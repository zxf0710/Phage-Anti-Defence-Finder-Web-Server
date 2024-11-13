package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysVdetailMapper;
import com.ruoyi.system.domain.SysVdetail;
import com.ruoyi.system.service.ISysVdetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@Service
public class SysVdetailServiceImpl implements ISysVdetailService 
{
    @Autowired
    private SysVdetailMapper sysVdetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param verifiedDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysVdetail selectSysVdetailByVerifiedDetailId(Long verifiedDetailId)
    {
        return sysVdetailMapper.selectSysVdetailByVerifiedDetailId(verifiedDetailId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysVdetail> selectSysVdetailList(SysVdetail sysVdetail)
    {
        return sysVdetailMapper.selectSysVdetailList(sysVdetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysVdetail(SysVdetail sysVdetail)
    {
        return sysVdetailMapper.insertSysVdetail(sysVdetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysVdetail(SysVdetail sysVdetail)
    {
        return sysVdetailMapper.updateSysVdetail(sysVdetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param verifiedDetailIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVdetailByVerifiedDetailIds(Long[] verifiedDetailIds)
    {
        return sysVdetailMapper.deleteSysVdetailByVerifiedDetailIds(verifiedDetailIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param verifiedDetailId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVdetailByVerifiedDetailId(Long verifiedDetailId)
    {
        return sysVdetailMapper.deleteSysVdetailByVerifiedDetailId(verifiedDetailId);
    }

    @Override
    public SysVdetail selectSysVdetailByProteinIds(String proteinIds) {
        return sysVdetailMapper.selectSysVdetailByProteinIds(proteinIds);
    }


}
