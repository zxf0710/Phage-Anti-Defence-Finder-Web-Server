package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_genome_list
 * 
 * @author ruoyi
 * @date 2023-05-07
 */
public class SysGenomeList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long genomeId;

    /** 输入文件路径(prodigal) */
    @Excel(name = "输入文件路径(prodigal)")
    private String inputFastap;

    /** 输出结果路径(prodigal) */
    @Excel(name = "输出结果路径(prodigal)")
    private String resultFastap;

    /** 输出结果路径(hmmer) */
    @Excel(name = "输出结果路径(hmmer)")
    private String resultFastah;

    /** 输入文件路径(hmmer) */
    @Excel(name = "输入文件路径(hmmer)")
    private String inputFastah;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String mailCount;

    /** 0:匹配成功 */
    @Excel(name = "0:匹配成功")
    private String resultDetail;

    /** 0:邮件已发送1:邮件未发送 */
    @Excel(name = "0:邮件已发送1:邮件未发送")
    private String isMail;

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

    public void setGenomeId(Long genomeId) 
    {
        this.genomeId = genomeId;
    }

    public Long getGenomeId() 
    {
        return genomeId;
    }
    public void setInputFastap(String inputFastap) 
    {
        this.inputFastap = inputFastap;
    }

    public String getInputFastap() 
    {
        return inputFastap;
    }
    public void setResultFastap(String resultFastap) 
    {
        this.resultFastap = resultFastap;
    }

    public String getResultFastap() 
    {
        return resultFastap;
    }
    public void setResultFastah(String resultFastah) 
    {
        this.resultFastah = resultFastah;
    }

    public String getResultFastah() 
    {
        return resultFastah;
    }
    public void setInputFastah(String inputFastah) 
    {
        this.inputFastah = inputFastah;
    }

    public String getInputFastah() 
    {
        return inputFastah;
    }
    public void setMailCount(String mailCount) 
    {
        this.mailCount = mailCount;
    }

    public String getMailCount() 
    {
        return mailCount;
    }
    public void setResultDetail(String resultDetail) 
    {
        this.resultDetail = resultDetail;
    }

    public String getResultDetail() 
    {
        return resultDetail;
    }
    public void setIsMail(String isMail) 
    {
        this.isMail = isMail;
    }

    public String getIsMail() 
    {
        return isMail;
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
            .append("genomeId", getGenomeId())
            .append("inputFastap", getInputFastap())
            .append("resultFastap", getResultFastap())
            .append("resultFastah", getResultFastah())
            .append("inputFastah", getInputFastah())
            .append("mailCount", getMailCount())
            .append("resultDetail", getResultDetail())
            .append("isMail", getIsMail())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("spare3", getSpare3())
            .append("spare4", getSpare4())
            .append("spare5", getSpare5())
            .toString();
    }
}
