package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sensoryneuromuscularfactors
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Sensoryneuromuscularfactors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String elderlyId;

    /** 时间 */
    @Excel(name = "时间")
    private String diagnosisTime;

    /** 视力障碍 */
    @Excel(name = "视力障碍")
    private Integer e1VisualImpairment;

    /** 听力异常 */
    @Excel(name = "听力异常")
    private Integer e2HearingAbnormality;

    /** 下肢肌力减弱 */
    @Excel(name = "下肢肌力减弱")
    private Integer e3LowerLimbMuscleWeakness;

    /** 握力下降 */
    @Excel(name = "握力下降")
    private Integer e4GripStrengthDecrease;

    /** 行走辅助器具 */
    @Excel(name = "行走辅助器具")
    private Integer e5WalkingAids;

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
    public void setE1VisualImpairment(Integer e1VisualImpairment) 
    {
        this.e1VisualImpairment = e1VisualImpairment;
    }

    public Integer getE1VisualImpairment() 
    {
        return e1VisualImpairment;
    }
    public void setE2HearingAbnormality(Integer e2HearingAbnormality) 
    {
        this.e2HearingAbnormality = e2HearingAbnormality;
    }

    public Integer getE2HearingAbnormality() 
    {
        return e2HearingAbnormality;
    }
    public void setE3LowerLimbMuscleWeakness(Integer e3LowerLimbMuscleWeakness) 
    {
        this.e3LowerLimbMuscleWeakness = e3LowerLimbMuscleWeakness;
    }

    public Integer getE3LowerLimbMuscleWeakness() 
    {
        return e3LowerLimbMuscleWeakness;
    }
    public void setE4GripStrengthDecrease(Integer e4GripStrengthDecrease) 
    {
        this.e4GripStrengthDecrease = e4GripStrengthDecrease;
    }

    public Integer getE4GripStrengthDecrease() 
    {
        return e4GripStrengthDecrease;
    }
    public void setE5WalkingAids(Integer e5WalkingAids) 
    {
        this.e5WalkingAids = e5WalkingAids;
    }

    public Integer getE5WalkingAids() 
    {
        return e5WalkingAids;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elderlyId", getElderlyId())
            .append("diagnosisTime", getDiagnosisTime())
            .append("e1VisualImpairment", getE1VisualImpairment())
            .append("e2HearingAbnormality", getE2HearingAbnormality())
            .append("e3LowerLimbMuscleWeakness", getE3LowerLimbMuscleWeakness())
            .append("e4GripStrengthDecrease", getE4GripStrengthDecrease())
            .append("e5WalkingAids", getE5WalkingAids())
            .toString();
    }
}
