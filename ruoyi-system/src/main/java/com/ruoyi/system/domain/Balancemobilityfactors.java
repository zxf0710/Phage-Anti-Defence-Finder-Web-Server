package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 balancemobilityfactors
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Balancemobilityfactors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String elderlyId;

    /** 时间 */
    @Excel(name = "时间")
    private String diagnosisDate;

    /** 行走能力 */
    @Excel(name = "行走能力")
    private Integer d1WalkingAbility;

    /** 步态不稳 */
    @Excel(name = "步态不稳")
    private Integer d2GaitInstability;

    /** 平衡障碍 */
    @Excel(name = "平衡障碍")
    private Integer d3BalanceDisorder;

    public void setElderlyId(String elderlyId) 
    {
        this.elderlyId = elderlyId;
    }

    public String getElderlyId() 
    {
        return elderlyId;
    }
    public void setDiagnosisDate(String diagnosisDate) 
    {
        this.diagnosisDate = diagnosisDate;
    }

    public String getDiagnosisDate() 
    {
        return diagnosisDate;
    }
    public void setD1WalkingAbility(Integer d1WalkingAbility) 
    {
        this.d1WalkingAbility = d1WalkingAbility;
    }

    public Integer getD1WalkingAbility() 
    {
        return d1WalkingAbility;
    }
    public void setD2GaitInstability(Integer d2GaitInstability) 
    {
        this.d2GaitInstability = d2GaitInstability;
    }

    public Integer getD2GaitInstability() 
    {
        return d2GaitInstability;
    }
    public void setD3BalanceDisorder(Integer d3BalanceDisorder) 
    {
        this.d3BalanceDisorder = d3BalanceDisorder;
    }

    public Integer getD3BalanceDisorder() 
    {
        return d3BalanceDisorder;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elderlyId", getElderlyId())
            .append("diagnosisDate", getDiagnosisDate())
            .append("d1WalkingAbility", getD1WalkingAbility())
            .append("d2GaitInstability", getD2GaitInstability())
            .append("d3BalanceDisorder", getD3BalanceDisorder())
            .toString();
    }
}
