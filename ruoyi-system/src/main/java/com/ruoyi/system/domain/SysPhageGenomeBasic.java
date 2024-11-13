package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_phage_genome_basic
 *
 * @author ruoyi
 * @date 2023-05-03
 */
public class SysPhageGenomeBasic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long basicId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phageGenomeAccession;

    /** 系族 */
    @Excel(name = "系族")
    private String systemFamily;

    /** ID */
    @Excel(name = "ID")
    private String proteinIds;

    /** 蛋白质 */
    @Excel(name = "蛋白质")
    private String protein;

    /** 抑制类型 */
    @Excel(name = "抑制类型")
    private String inhibitedType;

    /** 噬菌体 */
    @Excel(name = "噬菌体")
    private String phage;

    /** 宿主 */
    @Excel(name = "宿主")
    private String host;

    /** 长度 */
    @Excel(name = "长度")
    private String length;

    /** 备用字段1 */
    @Excel(name = "备用字段1")
    private String spare1;

    /** 备用字段2 */
    @Excel(name = "备用字段2")
    private String spare2;

    /** 备用字段3 */
    @Excel(name = "备用字段3")
    private String spare3;

    /** 备用字段4 */
    @Excel(name = "备用字段4")
    private String spare4;

    /** 备用字段5 */
    @Excel(name = "备用字段5")
    private String spare5;


    private String molecularWeight;

    private String hydrophobicity;


    private String isoelectricPoint;

    private String pID;

    @Override
    public String toString() {
        return "SysPhageGenomeBasic{" +
                "basicId=" + basicId +
                ", phageGenomeAccession='" + phageGenomeAccession + '\'' +
                ", systemFamily='" + systemFamily + '\'' +
                ", proteinIds='" + proteinIds + '\'' +
                ", protein='" + protein + '\'' +
                ", inhibitedType='" + inhibitedType + '\'' +
                ", phage='" + phage + '\'' +
                ", host='" + host + '\'' +
                ", length='" + length + '\'' +
                ", spare1='" + spare1 + '\'' +
                ", spare2='" + spare2 + '\'' +
                ", spare3='" + spare3 + '\'' +
                ", spare4='" + spare4 + '\'' +
                ", spare5='" + spare5 + '\'' +
                ", molecularWeight='" + molecularWeight + '\'' +
                ", hydrophobicity='" + hydrophobicity + '\'' +
                ", isoelectricPoint='" + isoelectricPoint + '\'' +
                '}';
    }


    public String getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(String molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getHydrophobicity() {
        return hydrophobicity;
    }

    public void setHydrophobicity(String hydrophobicity) {
        this.hydrophobicity = hydrophobicity;
    }

    public String getIsoelectricPoint() {
        return isoelectricPoint;
    }

    public void setIsoelectricPoint(String isoelectricPoint) {
        this.isoelectricPoint = isoelectricPoint;
    }


    public void setBasicId(Long basicId)
    {
        this.basicId = basicId;
    }

    public Long getBasicId()
    {
        return basicId;
    }
    public void setPhageGenomeAccession(String phageGenomeAccession)
    {
        this.phageGenomeAccession = phageGenomeAccession;
    }

    public String getPhageGenomeAccession()
    {
        return phageGenomeAccession;
    }
    public void setSystemFamily(String systemFamily)
    {
        this.systemFamily = systemFamily;
    }

    public String getSystemFamily()
    {
        return systemFamily;
    }
    public void setProteinIds(String proteinIds)
    {
        this.proteinIds = proteinIds;
    }

    public String getProteinIds()
    {
        return proteinIds;
    }
    public void setProtein(String protein)
    {
        this.protein = protein;
    }

    public String getProtein()
    {
        return protein;
    }
    public void setInhibitedType(String inhibitedType)
    {
        this.inhibitedType = inhibitedType;
    }

    public String getInhibitedType()
    {
        return inhibitedType;
    }
    public void setPhage(String phage)
    {
        this.phage = phage;
    }

    public String getPhage()
    {
        return phage;
    }
    public void setHost(String host)
    {
        this.host = host;
    }

    public String getHost()
    {
        return host;
    }
    public void setLength(String length)
    {
        this.length = length;
    }

    public String getLength()
    {
        return length;
    }
    public void setSpare1(String spare1)
    {
        this.spare1 = spare1;
    }

    public String getSpare1()
    {
        return spare1;
    }
    public void setSpare2(String spare2)
    {
        this.spare2 = spare2;
    }

    public String getSpare2()
    {
        return spare2;
    }
    public void setSpare3(String spare3)
    {
        this.spare3 = spare3;
    }

    public String getSpare3()
    {
        return spare3;
    }
    public void setSpare4(String spare4)
    {
        this.spare4 = spare4;
    }

    public String getSpare4()
    {
        return spare4;
    }
    public void setSpare5(String spare5)
    {
        this.spare5 = spare5;
    }

    public String getSpare5()
    {
        return spare5;
    }

    public String getpID() {
        return pID;
    }

    public void setpID(String pID) {
        this.pID = pID;
    }
}