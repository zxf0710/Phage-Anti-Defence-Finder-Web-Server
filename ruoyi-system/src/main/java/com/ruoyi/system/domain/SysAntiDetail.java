package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_anti_detail
 *
 * @author ruoyi
 * @date 2024-10-21
 */
public class SysAntiDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long antiDetailId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String systemName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String proteinId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String protein;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String eValue;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String scorePoint;

    private String  aID;


    public void setAntiDetailId(Long antiDetailId)
    {
        this.antiDetailId = antiDetailId;
    }

    public Long getAntiDetailId()
    {
        return antiDetailId;
    }
    public void setPhageId(String phageId)
    {
        this.phageId = phageId;
    }

    public String getPhageId()
    {
        return phageId;
    }
    public void setSystemName(String systemName)
    {
        this.systemName = systemName;
    }

    public String getSystemName()
    {
        return systemName;
    }
    public void setProteinId(String proteinId)
    {
        this.proteinId = proteinId;
    }

    public String getProteinId()
    {
        return proteinId;
    }
    public void setProtein(String protein)
    {
        this.protein = protein;
    }

    public String getProtein()
    {
        return protein;
    }
    public void seteValue(String eValue)
    {
        this.eValue = eValue;
    }

    public String geteValue()
    {
        return eValue;
    }
    public void setScorePoint(String scorePoint)
    {
        this.scorePoint = scorePoint;
    }

    public String getScorePoint()
    {
        return scorePoint;
    }


    public String getaID() {
        return aID;
    }

    public void setaID(String aID) {
        this.aID = aID;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("antiDetailId", getAntiDetailId())
            .append("phageId", getPhageId())
            .append("systemName", getSystemName())
            .append("proteinId", getProteinId())
            .append("protein", getProtein())
            .append("eValue", geteValue())
            .append("scorePoint", getScorePoint())
            .append("aID", getaID())
            .toString();
    }


}
