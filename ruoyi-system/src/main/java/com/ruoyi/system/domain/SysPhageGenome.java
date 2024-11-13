package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_phage_genome
 *
 * @author ruoyi
 * @date 2023-05-03
 */
public class SysPhageGenome extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long phageId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phageName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phageGenomeAccession;

    public String getAntiDenfenceSystemNumbers() {
        return antiDenfenceSystemNumbers;
    }

    public void setAntiDenfenceSystemNumbers(String antiDenfenceSystemNumbers) {
        this.antiDenfenceSystemNumbers = antiDenfenceSystemNumbers;
    }

    /** $column.columnComment */

    private String antiDenfenceSystemNumbers;


    private String host;


    private String spare1;



    private String spare2;


    private String spare3;



    private String spare4;



    private String spare5;

    public void setPhageId(Long phageId)
    {
        this.phageId = phageId;
    }

    public Long getPhageId()
    {
        return phageId;
    }
    public void setPhageName(String phageName)
    {
        this.phageName = phageName;
    }

    public String getPhageName()
    {
        return phageName;
    }
    public void setPhageGenomeAccession(String phageGenomeAccession)
    {
        this.phageGenomeAccession = phageGenomeAccession;
    }

    public String getPhageGenomeAccession()
    {
        return phageGenomeAccession;
    }

    public void setHost(String host)
    {
        this.host = host;
    }

    public String getHost()
    {
        return host;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("phageId", getPhageId())
            .append("phageName", getPhageName())
            .append("phageGenomeAccession", getPhageGenomeAccession())
            .append("antiDenfenceSystemNumbers", getAntiDenfenceSystemNumbers())
            .append("host", getHost())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("spare3", getSpare3())
            .append("spare4", getSpare4())
            .append("spare5", getSpare5())
            .toString();
    }
}
