package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 diseasefactors
 * 
 * @author ruoyi
 * @date 2024-11-10
 */
public class Diseasefactors extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 病人ID */
    @Excel(name = "病人ID")
    private String patientId;

    /** 共病 */
    @Excel(name = "共病")
    private Integer b1Comorbidity;

    /** 疾病种类 */
    @Excel(name = "疾病种类")
    private String b2DiseaseType;

    /** 诊断时间 */
    @Excel(name = "诊断时间")
    private String diagnosisDate;

    public void setPatientId(String patientId) 
    {
        this.patientId = patientId;
    }

    public String getPatientId() 
    {
        return patientId;
    }
    public void setB1Comorbidity(Integer b1Comorbidity) 
    {
        this.b1Comorbidity = b1Comorbidity;
    }

    public Integer getB1Comorbidity() 
    {
        return b1Comorbidity;
    }
    public void setB2DiseaseType(String b2DiseaseType) 
    {
        this.b2DiseaseType = b2DiseaseType;
    }

    public String getB2DiseaseType() 
    {
        return b2DiseaseType;
    }
    public void setDiagnosisDate(String diagnosisDate) 
    {
        this.diagnosisDate = diagnosisDate;
    }

    public String getDiagnosisDate() 
    {
        return diagnosisDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("patientId", getPatientId())
            .append("b1Comorbidity", getB1Comorbidity())
            .append("b2DiseaseType", getB2DiseaseType())
            .append("diagnosisDate", getDiagnosisDate())
            .toString();
    }
}
