package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_sequence
 * 
 * @author ruoyi
 * @date 2023-04-27
 */
public class SysSequence extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long fileId;

    /** 输入文件路径 */
    @Excel(name = "输入文件路径")
    private String inputFasta;

    /** 输出结果路径 */
    @Excel(name = "输出结果路径")
    private String resultFasta;

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

    public void setFileId(Long fileId) 
    {
        this.fileId = fileId;
    }

    public Long getFileId() 
    {
        return fileId;
    }
    public void setInputFasta(String inputFasta) 
    {
        this.inputFasta = inputFasta;
    }

    public String getInputFasta() 
    {
        return inputFasta;
    }
    public void setResultFasta(String resultFasta) 
    {
        this.resultFasta = resultFasta;
    }

    public String getResultFasta() 
    {
        return resultFasta;
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
            .append("fileId", getFileId())
            .append("inputFasta", getInputFasta())
            .append("resultFasta", getResultFasta())
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
