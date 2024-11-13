package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.BalancemobilityfactorsMapper;
import com.ruoyi.system.domain.Balancemobilityfactors;
import com.ruoyi.system.service.IBalancemobilityfactorsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class BalancemobilityfactorsServiceImpl implements IBalancemobilityfactorsService 
{
    @Autowired
    private BalancemobilityfactorsMapper balancemobilityfactorsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Balancemobilityfactors selectBalancemobilityfactorsByElderlyId(String elderlyId)
    {
        return balancemobilityfactorsMapper.selectBalancemobilityfactorsByElderlyId(elderlyId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Balancemobilityfactors> selectBalancemobilityfactorsList(Balancemobilityfactors balancemobilityfactors)
    {
        return balancemobilityfactorsMapper.selectBalancemobilityfactorsList(balancemobilityfactors);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertBalancemobilityfactors(Balancemobilityfactors balancemobilityfactors)
    {
        return balancemobilityfactorsMapper.insertBalancemobilityfactors(balancemobilityfactors);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateBalancemobilityfactors(Balancemobilityfactors balancemobilityfactors)
    {
        return balancemobilityfactorsMapper.updateBalancemobilityfactors(balancemobilityfactors);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBalancemobilityfactorsByElderlyIds(String[] elderlyIds)
    {
        return balancemobilityfactorsMapper.deleteBalancemobilityfactorsByElderlyIds(elderlyIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteBalancemobilityfactorsByElderlyId(String elderlyId)
    {
        return balancemobilityfactorsMapper.deleteBalancemobilityfactorsByElderlyId(elderlyId);
    }
}
