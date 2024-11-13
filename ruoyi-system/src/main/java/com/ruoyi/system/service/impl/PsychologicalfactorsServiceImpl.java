package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PsychologicalfactorsMapper;
import com.ruoyi.system.domain.Psychologicalfactors;
import com.ruoyi.system.service.IPsychologicalfactorsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class PsychologicalfactorsServiceImpl implements IPsychologicalfactorsService 
{
    @Autowired
    private PsychologicalfactorsMapper psychologicalfactorsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Psychologicalfactors selectPsychologicalfactorsByElderlyId(String elderlyId)
    {
        return psychologicalfactorsMapper.selectPsychologicalfactorsByElderlyId(elderlyId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Psychologicalfactors> selectPsychologicalfactorsList(Psychologicalfactors psychologicalfactors)
    {
        return psychologicalfactorsMapper.selectPsychologicalfactorsList(psychologicalfactors);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPsychologicalfactors(Psychologicalfactors psychologicalfactors)
    {
        return psychologicalfactorsMapper.insertPsychologicalfactors(psychologicalfactors);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePsychologicalfactors(Psychologicalfactors psychologicalfactors)
    {
        return psychologicalfactorsMapper.updatePsychologicalfactors(psychologicalfactors);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePsychologicalfactorsByElderlyIds(String[] elderlyIds)
    {
        return psychologicalfactorsMapper.deletePsychologicalfactorsByElderlyIds(elderlyIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePsychologicalfactorsByElderlyId(String elderlyId)
    {
        return psychologicalfactorsMapper.deletePsychologicalfactorsByElderlyId(elderlyId);
    }
}
