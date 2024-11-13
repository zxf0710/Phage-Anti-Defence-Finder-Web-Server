package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Diseasefactors;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface IDiseasefactorsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param patientId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Diseasefactors selectDiseasefactorsByPatientId(String patientId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Diseasefactors> selectDiseasefactorsList(Diseasefactors diseasefactors);

    /**
     * 新增【请填写功能名称】
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 结果
     */
    public int insertDiseasefactors(Diseasefactors diseasefactors);

    /**
     * 修改【请填写功能名称】
     * 
     * @param diseasefactors 【请填写功能名称】
     * @return 结果
     */
    public int updateDiseasefactors(Diseasefactors diseasefactors);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param patientIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteDiseasefactorsByPatientIds(String[] patientIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param patientId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDiseasefactorsByPatientId(String patientId);
}
