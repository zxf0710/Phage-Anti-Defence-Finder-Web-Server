package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 drugfactors
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Drugfactors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    @Excel(name = "编号")
    private String elderlyId;

    /** 诊断时间 */
    @Excel(name = "诊断时间")
    private String diagnosisDate;

    /** 多重用药 */
    @Excel(name = "多重用药")
    private Integer c1Polypharmacy;

    /** 药物种类 */
    @Excel(name = "药物种类")
    private String c2DrugType;

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
    public void setC1Polypharmacy(Integer c1Polypharmacy) 
    {
        this.c1Polypharmacy = c1Polypharmacy;
    }

    public Integer getC1Polypharmacy() 
    {
        return c1Polypharmacy;
    }
    public void setC2DrugType(String c2DrugType) 
    {
        this.c2DrugType = c2DrugType;
    }

    public String getC2DrugType() 
    {
        return c2DrugType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("elderlyId", getElderlyId())
            .append("diagnosisDate", getDiagnosisDate())
            .append("c1Polypharmacy", getC1Polypharmacy())
            .append("c2DrugType", getC2DrugType())
            .toString();
    }
}
