package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Drugfactors;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface DrugfactorsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Drugfactors selectDrugfactorsByElderlyId(String elderlyId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Drugfactors> selectDrugfactorsList(Drugfactors drugfactors);

    /**
     * 新增【请填写功能名称】
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 结果
     */
    public int insertDrugfactors(Drugfactors drugfactors);

    /**
     * 修改【请填写功能名称】
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 结果
     */
    public int updateDrugfactors(Drugfactors drugfactors);

    /**
     * 删除【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteDrugfactorsByElderlyId(String elderlyId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteDrugfactorsByElderlyIds(String[] elderlyIds);
}
