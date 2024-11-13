package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPhageGenomeBasicMapper;
import com.ruoyi.system.domain.SysPhageGenomeBasic;
import com.ruoyi.system.service.ISysPhageGenomeBasicService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class SysPhageGenomeBasicServiceImpl implements ISysPhageGenomeBasicService 
{
    @Autowired
    private SysPhageGenomeBasicMapper sysPhageGenomeBasicMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param basicId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysPhageGenomeBasic selectSysPhageGenomeBasicByBasicId(Long basicId)
    {
        return sysPhageGenomeBasicMapper.selectSysPhageGenomeBasicByBasicId(basicId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPhageGenomeBasic> selectSysPhageGenomeBasicList(SysPhageGenomeBasic sysPhageGenomeBasic)
    {
        return sysPhageGenomeBasicMapper.selectSysPhageGenomeBasicList(sysPhageGenomeBasic);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPhageGenomeBasic(SysPhageGenomeBasic sysPhageGenomeBasic)
    {
        return sysPhageGenomeBasicMapper.insertSysPhageGenomeBasic(sysPhageGenomeBasic);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPhageGenomeBasic 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPhageGenomeBasic(SysPhageGenomeBasic sysPhageGenomeBasic)
    {
        return sysPhageGenomeBasicMapper.updateSysPhageGenomeBasic(sysPhageGenomeBasic);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param basicIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPhageGenomeBasicByBasicIds(Long[] basicIds)
    {
        return sysPhageGenomeBasicMapper.deleteSysPhageGenomeBasicByBasicIds(basicIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param basicId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPhageGenomeBasicByBasicId(Long basicId)
    {
        return sysPhageGenomeBasicMapper.deleteSysPhageGenomeBasicByBasicId(basicId);
    }
}
