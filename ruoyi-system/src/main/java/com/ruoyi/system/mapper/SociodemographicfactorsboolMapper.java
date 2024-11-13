package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Sociodemographicfactorsbool;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface SociodemographicfactorsboolMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Sociodemographicfactorsbool selectSociodemographicfactorsboolByElderlyId(String elderlyId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Sociodemographicfactorsbool> selectSociodemographicfactorsboolList(Sociodemographicfactorsbool sociodemographicfactorsbool);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 结果
     */
    public int insertSociodemographicfactorsbool(Sociodemographicfactorsbool sociodemographicfactorsbool);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sociodemographicfactorsbool 【请填写功能名称】
     * @return 结果
     */
    public int updateSociodemographicfactorsbool(Sociodemographicfactorsbool sociodemographicfactorsbool);

    /**
     * 删除【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSociodemographicfactorsboolByElderlyId(String elderlyId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSociodemographicfactorsboolByElderlyIds(String[] elderlyIds);
}
