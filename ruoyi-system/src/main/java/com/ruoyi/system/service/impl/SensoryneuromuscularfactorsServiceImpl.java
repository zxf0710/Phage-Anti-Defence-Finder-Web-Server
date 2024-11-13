package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SensoryneuromuscularfactorsMapper;
import com.ruoyi.system.domain.Sensoryneuromuscularfactors;
import com.ruoyi.system.service.ISensoryneuromuscularfactorsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
@Service
public class SensoryneuromuscularfactorsServiceImpl implements ISensoryneuromuscularfactorsService 
{
    @Autowired
    private SensoryneuromuscularfactorsMapper sensoryneuromuscularfactorsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Sensoryneuromuscularfactors selectSensoryneuromuscularfactorsByElderlyId(String elderlyId)
    {
        return sensoryneuromuscularfactorsMapper.selectSensoryneuromuscularfactorsByElderlyId(elderlyId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Sensoryneuromuscularfactors> selectSensoryneuromuscularfactorsList(Sensoryneuromuscularfactors sensoryneuromuscularfactors)
    {
        return sensoryneuromuscularfactorsMapper.selectSensoryneuromuscularfactorsList(sensoryneuromuscularfactors);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSensoryneuromuscularfactors(Sensoryneuromuscularfactors sensoryneuromuscularfactors)
    {
        return sensoryneuromuscularfactorsMapper.insertSensoryneuromuscularfactors(sensoryneuromuscularfactors);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sensoryneuromuscularfactors 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSensoryneuromuscularfactors(Sensoryneuromuscularfactors sensoryneuromuscularfactors)
    {
        return sensoryneuromuscularfactorsMapper.updateSensoryneuromuscularfactors(sensoryneuromuscularfactors);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSensoryneuromuscularfactorsByElderlyIds(String[] elderlyIds)
    {
        return sensoryneuromuscularfactorsMapper.deleteSensoryneuromuscularfactorsByElderlyIds(elderlyIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSensoryneuromuscularfactorsByElderlyId(String elderlyId)
    {
        return sensoryneuromuscularfactorsMapper.deleteSensoryneuromuscularfactorsByElderlyId(elderlyId);
    }
}
