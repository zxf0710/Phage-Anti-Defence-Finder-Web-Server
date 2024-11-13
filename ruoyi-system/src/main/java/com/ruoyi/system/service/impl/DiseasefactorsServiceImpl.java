package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DiseasefactorsMapper;
import com.ruoyi.system.domain.Diseasefactors;
import com.ruoyi.system.service.IDiseasefactorsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class DiseasefactorsServiceImpl implements IDiseasefactorsService 
{
    @Autowired
    private DiseasefactorsMapper diseasefactorsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param patientId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Diseasefactors selectDiseasefactorsByPatientId(String patientId)
    {
        return diseasefactorsMapper.selectDiseasefactorsByPatientId(patientId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Diseasefactors> selectDiseasefactorsList(Diseasefactors diseasefactors)
    {
        return diseasefactorsMapper.selectDiseasefactorsList(diseasefactors);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDiseasefactors(Diseasefactors diseasefactors)
    {
        return diseasefactorsMapper.insertDiseasefactors(diseasefactors);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDiseasefactors(Diseasefactors diseasefactors)
    {
        return diseasefactorsMapper.updateDiseasefactors(diseasefactors);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param patientIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDiseasefactorsByPatientIds(String[] patientIds)
    {
        return diseasefactorsMapper.deleteDiseasefactorsByPatientIds(patientIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param patientId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDiseasefactorsByPatientId(String patientId)
    {
        return diseasefactorsMapper.deleteDiseasefactorsByPatientId(patientId);
    }
}
