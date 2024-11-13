package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Sensoryneuromuscularfactors;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface ISensoryneuromuscularfactorsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Sensoryneuromuscularfactors selectSensoryneuromuscularfactorsByElderlyId(String elderlyId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Sensoryneuromuscularfactors> selectSensoryneuromuscularfactorsList(Sensoryneuromuscularfactors sensoryneuromuscularfactors);

    /**
     * 新增【请填写功能名称】
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 结果
     */
    public int insertSensoryneuromuscularfactors(Sensoryneuromuscularfactors sensoryneuromuscularfactors);

    /**
     * 修改【请填写功能名称】
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 结果
     */
    public int updateSensoryneuromuscularfactors(Sensoryneuromuscularfactors sensoryneuromuscularfactors);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteSensoryneuromuscularfactorsByElderlyIds(String[] elderlyIds);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSensoryneuromuscularfactorsByElderlyId(String elderlyId);
}
