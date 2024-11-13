package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPdetailMapper;
import com.ruoyi.system.domain.SysPdetail;
import com.ruoyi.system.service.ISysPdetailService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@Service
public class SysPdetailServiceImpl implements ISysPdetailService 
{
    @Autowired
    private SysPdetailMapper sysPdetailMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param predictedDetailId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysPdetail selectSysPdetailByPredictedDetailId(Long predictedDetailId)
    {
        return sysPdetailMapper.selectSysPdetailByPredictedDetailId(predictedDetailId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPdetail> selectSysPdetailList(SysPdetail sysPdetail)
    {
        return sysPdetailMapper.selectSysPdetailList(sysPdetail);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPdetail(SysPdetail sysPdetail)
    {
        return sysPdetailMapper.insertSysPdetail(sysPdetail);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPdetail 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPdetail(SysPdetail sysPdetail)
    {
        return sysPdetailMapper.updateSysPdetail(sysPdetail);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param predictedDetailIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPdetailByPredictedDetailIds(Long[] predictedDetailIds)
    {
        return sysPdetailMapper.deleteSysPdetailByPredictedDetailIds(predictedDetailIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param predictedDetailId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPdetailByPredictedDetailId(Long predictedDetailId)
    {
        return sysPdetailMapper.deleteSysPdetailByPredictedDetailId(predictedDetailId);
    }

    @Override
    public SysPdetail selectSysPdetailByProteinIds(String proteinIds) {
        return sysPdetailMapper.selectSysPdetailByProteinIds(proteinIds);
    }
}
