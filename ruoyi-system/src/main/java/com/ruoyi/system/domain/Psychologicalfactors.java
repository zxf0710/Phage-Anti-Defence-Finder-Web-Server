package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 psychologicalfactors
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Psychologicalfactors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String elderlyId;

    /** 时间 */
    @Excel(name = "时间")
    private String diagnosisTime;

    /** 意识模糊 */
    @Excel(name = "意识模糊")
    private Integer f1ConsciousnessDisturbance;

    /** 抑郁 */
    @Excel(name = "抑郁")
    private Integer f2Depression;

    /** 焦虑 */
    @Excel(name = "焦虑")
    private Integer f3Anxiety;

    /** 认知功能 */
    @Excel(name = "认知功能")
    private Integer f4CognitiveFunction;

    public void setElderlyId(String elderlyId) 
    {
        this.elderlyId = elderlyId;
    }

    public String getElderlyId() 
    {
        return elderlyId;
    }
    public void setDiagnosisTime(String diagnosisTime) 
    {
        this.diagnosisTime = diagnosisTime;
    }

    public String getDiagnosisTime() 
    {
        return diagnosisTime;
    }
    public void setF1ConsciousnessDisturbance(Integer f1ConsciousnessDisturbance) 
    {
        this.f1ConsciousnessDisturbance = f1ConsciousnessDisturbance;
    }

    public Integer getF1ConsciousnessDisturbance() 
    {
        return f1ConsciousnessDisturbance;
    }
    public void setF2Depression(Integer f2Depression) 
    {
        this.f2Depression = f2Depression;
    }

    public Integer getF2Depression() 
    {
        return f2Depression;
    }
    public void setF3Anxiety(Integer f3Anxiety) 
    {
        this.f3Anxiety = f3Anxiety;
    }

    public Integer getF3Anxiety() 
    {
        return f3Anxiety;
    }
    public void setF4CognitiveFunction(Integer f4CognitiveFunction) 
    {
        this.f4CognitiveFunction = f4CognitiveFunction;
    }

    public Integer getF4CognitiveFunction() 
    {
        return f4CognitiveFunction;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elderlyId", getElderlyId())
            .append("diagnosisTime", getDiagnosisTime())
            .append("f1ConsciousnessDisturbance", getF1ConsciousnessDisturbance())
            .append("f2Depression", getF2Depression())
            .append("f3Anxiety", getF3Anxiety())
            .append("f4CognitiveFunction", getF4CognitiveFunction())
            .toString();
    }
}
