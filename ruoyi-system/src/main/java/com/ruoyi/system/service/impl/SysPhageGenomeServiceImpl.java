package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPhageGenomeMapper;
import com.ruoyi.system.domain.SysPhageGenome;
import com.ruoyi.system.service.ISysPhageGenomeService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@Service
public class SysPhageGenomeServiceImpl implements ISysPhageGenomeService 
{
    @Autowired
    private SysPhageGenomeMapper sysPhageGenomeMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param phageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysPhageGenome selectSysPhageGenomeByPhageId(Long phageId)
    {
        return sysPhageGenomeMapper.selectSysPhageGenomeByPhageId(phageId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPhageGenome> selectSysPhageGenomeList(SysPhageGenome sysPhageGenome)
    {
        return sysPhageGenomeMapper.selectSysPhageGenomeList(sysPhageGenome);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPhageGenome(SysPhageGenome sysPhageGenome)
    {
        return sysPhageGenomeMapper.insertSysPhageGenome(sysPhageGenome);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPhageGenome 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPhageGenome(SysPhageGenome sysPhageGenome)
    {
        return sysPhageGenomeMapper.updateSysPhageGenome(sysPhageGenome);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param phageIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPhageGenomeByPhageIds(Long[] phageIds)
    {
        return sysPhageGenomeMapper.deleteSysPhageGenomeByPhageIds(phageIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param phageId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPhageGenomeByPhageId(Long phageId)
    {
        return sysPhageGenomeMapper.deleteSysPhageGenomeByPhageId(phageId);
    }

    @Override
    public List<SysPhageGenome> selectSortList(SysPhageGenome sysPhageGenome) {
        //排序条件
        String condition = " " ;
        if(sysPhageGenome.getSpare2().equals("ascending")){
            condition = " asc" ;
        }else if (sysPhageGenome.getSpare2().equals("descending")){
            condition = " desc" ;
        }

        if(sysPhageGenome.getSpare1().equals("phageName")){
            condition = " phage_name" + condition ;
        }else if(sysPhageGenome.getSpare1().equals("phageGenomeAccession")){
            condition = " phage_genome_accession" + condition ;
        }else if(sysPhageGenome.getSpare1().equals("antiDenfenceSystemNumbers")){
            condition = " anti_denfence_system_numbers" + condition ;
        }else if(sysPhageGenome.getSpare1().equals("host")){
            condition = " host" + condition ;
        }
        sysPhageGenome.setSpare1(condition);
        return sysPhageGenomeMapper.selectSortList(sysPhageGenome);
    }

    @Override
    public List<SysPhageGenome> mhselectList(String condition) {
        return sysPhageGenomeMapper.mhselectList(condition);
    }
}
