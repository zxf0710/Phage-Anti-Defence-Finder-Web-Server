package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysVerifiedMapper;
import com.ruoyi.system.domain.SysVerified;
import com.ruoyi.system.service.ISysVerifiedService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@Service
public class SysVerifiedServiceImpl implements ISysVerifiedService 
{
    @Autowired
    private SysVerifiedMapper sysVerifiedMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param verifiedId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysVerified selectSysVerifiedByVerifiedId(Long verifiedId)
    {
        return sysVerifiedMapper.selectSysVerifiedByVerifiedId(verifiedId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysVerified> selectSysVerifiedList(SysVerified sysVerified)
    {
        return sysVerifiedMapper.selectSysVerifiedList(sysVerified);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysVerified(SysVerified sysVerified)
    {
        return sysVerifiedMapper.insertSysVerified(sysVerified);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysVerified 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysVerified(SysVerified sysVerified)
    {
        return sysVerifiedMapper.updateSysVerified(sysVerified);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param verifiedIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVerifiedByVerifiedIds(Long[] verifiedIds)
    {
        return sysVerifiedMapper.deleteSysVerifiedByVerifiedIds(verifiedIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param verifiedId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysVerifiedByVerifiedId(Long verifiedId)
    {
        return sysVerifiedMapper.deleteSysVerifiedByVerifiedId(verifiedId);
    }

    @Override
    public List<SysVerified> selectList(SysVerified sysVerified) {
        String condition = " " ;
        //排序条件
        if(sysVerified.getSpare3()!= null && sysVerified.getSpare2()!= null){
            if(sysVerified.getSpare3().equals("ascending")){
                condition = " asc" ;
            }else if (sysVerified.getSpare3().equals("descending")){
                condition = " desc" ;
            }
            if(sysVerified.getSpare2().equals("systemFamily")){
                condition = " system_family" + condition ;
            }else if(sysVerified.getSpare2().equals("proteinIds")){
                condition = " protein_ids" + condition ;
            }else if(sysVerified.getSpare2().equals("protein")){
                condition = " protein" + condition ;
            }else if(sysVerified.getSpare2().equals("inhibitedType")){
                condition = " inhibited_type" + condition ;
            }else if(sysVerified.getSpare2().equals("phage")){
                condition = " phage" + condition ;
            }else if(sysVerified.getSpare2().equals("host")){
                condition = " host" + condition ;
            }else if(sysVerified.getSpare2().equals("lenth")){
                condition = " CONVERT(lenth,signed)" + condition ;
            }else if(sysVerified.getSpare2().equals("cankaowenxian")){
                condition = " cankaowenxian" + condition ;
            }
            condition = "order by " + condition;

        }
        sysVerified.setSpare3(condition);
        return sysVerifiedMapper.selectList(sysVerified);
    }

    @Override
    public List<SysVerified> selectSortList(SysVerified sysVerified) {
        //排序条件
        String condition = " " ;
        if(sysVerified.getSpare2().equals("ascending")){
            condition = " asc" ;
        }else if (sysVerified.getSpare2().equals("descending")){
            condition = " desc" ;
        }

        if(sysVerified.getSpare1().equals("systemFamily")){
            condition = " system_family" + condition ;
        }else if(sysVerified.getSpare1().equals("proteinIds")){
            condition = " protein_ids" + condition ;
        }else if(sysVerified.getSpare1().equals("protein")){
            condition = " protein" + condition ;
        }else if(sysVerified.getSpare1().equals("inhibitedType")){
            condition = " inhibited_type" + condition ;
        }else if(sysVerified.getSpare1().equals("phage")){
            condition = " phage" + condition ;
        }else if(sysVerified.getSpare1().equals("host")){
            condition = " host" + condition ;
        }else if(sysVerified.getSpare1().equals("lenth")){
            condition = " CONVERT(lenth,signed)" + condition ;
        }else if(sysVerified.getSpare1().equals("cankaowenxian")){
            condition = " cankaowenxian" + condition ;
        }
        sysVerified.setSpare1(condition);
        return sysVerifiedMapper.selectSortList(sysVerified);
    }

    @Override
    public List<SysVerified> mhselectList(String condition) {
        return sysVerifiedMapper.mhselectList(condition);
    }
}
