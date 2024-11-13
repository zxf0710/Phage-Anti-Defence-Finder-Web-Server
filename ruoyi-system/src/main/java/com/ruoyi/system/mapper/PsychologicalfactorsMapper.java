package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Psychologicalfactors;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface PsychologicalfactorsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Psychologicalfactors selectPsychologicalfactorsByElderlyId(String elderlyId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Psychologicalfactors> selectPsychologicalfactorsList(Psychologicalfactors psychologicalfactors);

    /**
     * 新增【请填写功能名称】
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 结果
     */
    public int insertPsychologicalfactors(Psychologicalfactors psychologicalfactors);

    /**
     * 修改【请填写功能名称】
     * 
     * @param psychologicalfactors 【请填写功能名称】
     * @return 结果
     */
    public int updatePsychologicalfactors(Psychologicalfactors psychologicalfactors);

    /**
     * 删除【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePsychologicalfactorsByElderlyId(String elderlyId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePsychologicalfactorsByElderlyIds(String[] elderlyIds);
}
