package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SociodemographicfactorsboolMapper;
import com.ruoyi.system.domain.Sociodemographicfactorsbool;
import com.ruoyi.system.service.ISociodemographicfactorsboolService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class SociodemographicfactorsboolServiceImpl implements ISociodemographicfactorsboolService 
{
    @Autowired
    private SociodemographicfactorsboolMapper sociodemographicfactorsboolMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Sociodemographicfactorsbool selectSociodemographicfactorsboolByElderlyId(String elderlyId)
    {
        return sociodemographicfactorsboolMapper.selectSociodemographicfactorsboolByElderlyId(elderlyId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Sociodemographicfactorsbool> selectSociodemographicfactorsboolList(Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        return sociodemographicfactorsboolMapper.selectSociodemographicfactorsboolList(sociodemographicfactorsbool);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSociodemographicfactorsbool(Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        return sociodemographicfactorsboolMapper.insertSociodemographicfactorsbool(sociodemographicfactorsbool);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSociodemographicfactorsbool(Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        return sociodemographicfactorsboolMapper.updateSociodemographicfactorsbool(sociodemographicfactorsbool);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSociodemographicfactorsboolByElderlyIds(String[] elderlyIds)
    {
        return sociodemographicfactorsboolMapper.deleteSociodemographicfactorsboolByElderlyIds(elderlyIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSociodemographicfactorsboolByElderlyId(String elderlyId)
    {
        return sociodemographicfactorsboolMapper.deleteSociodemographicfactorsboolByElderlyId(elderlyId);
    }
}
