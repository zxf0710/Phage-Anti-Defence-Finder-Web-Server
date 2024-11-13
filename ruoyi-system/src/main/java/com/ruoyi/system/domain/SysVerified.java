package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_verified
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
public class SysVerified extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 已验证id */
    private Long verifiedId;

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
    private String lenth;

    /** 参考文献 */
    @Excel(name = "参考文献")
    private String cankaowenxian;

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

    public void setVerifiedId(Long verifiedId) 
    {
        this.verifiedId = verifiedId;
    }

    public Long getVerifiedId() 
    {
        return verifiedId;
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
    public void setLenth(String lenth) 
    {
        this.lenth = lenth;
    }

    public String getLenth() 
    {
        return lenth;
    }
    public void setCankaowenxian(String cankaowenxian) 
    {
        this.cankaowenxian = cankaowenxian;
    }

    public String getCankaowenxian() 
    {
        return cankaowenxian;
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
            .append("verifiedId", getVerifiedId())
            .append("systemFamily", getSystemFamily())
            .append("proteinIds", getProteinIds())
            .append("protein", getProtein())
            .append("inhibitedType", getInhibitedType())
            .append("phage", getPhage())
            .append("host", getHost())
            .append("lenth", getLenth())
            .append("cankaowenxian", getCankaowenxian())
            .append("spare1", getSpare1())
            .append("spare2", getSpare2())
            .append("spare3", getSpare3())
            .append("spare4", getSpare4())
            .append("spare5", getSpare5())
            .toString();
    }
}
