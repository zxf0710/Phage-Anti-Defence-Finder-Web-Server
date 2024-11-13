package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DrugfactorsMapper;
import com.ruoyi.system.domain.Drugfactors;
import com.ruoyi.system.service.IDrugfactorsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class DrugfactorsServiceImpl implements IDrugfactorsService 
{
    @Autowired
    private DrugfactorsMapper drugfactorsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Drugfactors selectDrugfactorsByElderlyId(String elderlyId)
    {
        return drugfactorsMapper.selectDrugfactorsByElderlyId(elderlyId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Drugfactors> selectDrugfactorsList(Drugfactors drugfactors)
    {
        return drugfactorsMapper.selectDrugfactorsList(drugfactors);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDrugfactors(Drugfactors drugfactors)
    {
        return drugfactorsMapper.insertDrugfactors(drugfactors);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param drugfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDrugfactors(Drugfactors drugfactors)
    {
        return drugfactorsMapper.updateDrugfactors(drugfactors);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDrugfactorsByElderlyIds(String[] elderlyIds)
    {
        return drugfactorsMapper.deleteDrugfactorsByElderlyIds(elderlyIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteDrugfactorsByElderlyId(String elderlyId)
    {
        return drugfactorsMapper.deleteDrugfactorsByElderlyId(elderlyId);
    }
}
