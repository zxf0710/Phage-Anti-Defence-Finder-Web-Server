package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sociodemographicfactorsbool
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Sociodemographicfactorsbool extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String elderlyId;

    /** 时间 */
    @Excel(name = "时间")
    private String diagnosisDate;

    /** 年龄是否≥70岁 */
    @Excel(name = "年龄是否≥70岁")
    private Integer a1AgeGe70;

    /** 是否为男性 */
    @Excel(name = "是否为男性")
    private Integer a2GenderMale;

    /** 过去一年内是否有跌倒史 */
    @Excel(name = "过去一年内是否有跌倒史")
    private Integer a3FallHistory;

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
    public void setA1AgeGe70(Integer a1AgeGe70) 
    {
        this.a1AgeGe70 = a1AgeGe70;
    }

    public Integer getA1AgeGe70() 
    {
        return a1AgeGe70;
    }
    public void setA2GenderMale(Integer a2GenderMale) 
    {
        this.a2GenderMale = a2GenderMale;
    }

    public Integer getA2GenderMale() 
    {
        return a2GenderMale;
    }
    public void setA3FallHistory(Integer a3FallHistory) 
    {
        this.a3FallHistory = a3FallHistory;
    }

    public Integer getA3FallHistory() 
    {
        return a3FallHistory;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elderlyId", getElderlyId())
            .append("diagnosisDate", getDiagnosisDate())
            .append("a1AgeGe70", getA1AgeGe70())
            .append("a2GenderMale", getA2GenderMale())
            .append("a3FallHistory", getA3FallHistory())
            .toString();
    }
}
