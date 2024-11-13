package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Balancemobilityfactors;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public interface BalancemobilityfactorsMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Balancemobilityfactors selectBalancemobilityfactorsByElderlyId(String elderlyId);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Balancemobilityfactors> selectBalancemobilityfactorsList(Balancemobilityfactors balancemobilityfactors);

    /**
     * 新增【请填写功能名称】
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 结果
     */
    public int insertBalancemobilityfactors(Balancemobilityfactors balancemobilityfactors);

    /**
     * 修改【请填写功能名称】
     * 
     * @param balancemobilityfactors 【请填写功能名称】
     * @return 结果
     */
    public int updateBalancemobilityfactors(Balancemobilityfactors balancemobilityfactors);

    /**
     * 删除【请填写功能名称】
     * 
     * @param elderlyId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteBalancemobilityfactorsByElderlyId(String elderlyId);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param elderlyIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBalancemobilityfactorsByElderlyIds(String[] elderlyIds);
}
