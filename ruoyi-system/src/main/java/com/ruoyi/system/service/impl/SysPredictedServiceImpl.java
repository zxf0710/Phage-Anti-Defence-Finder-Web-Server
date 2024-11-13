package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SysPredictedMapper;
import com.ruoyi.system.domain.SysPredicted;
import com.ruoyi.system.service.ISysPredictedService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@Service
public class SysPredictedServiceImpl implements ISysPredictedService 
{
    @Autowired
    private SysPredictedMapper sysPredictedMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param predictedId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public SysPredicted selectSysPredictedByPredictedId(Long predictedId)
    {
        return sysPredictedMapper.selectSysPredictedByPredictedId(predictedId);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<SysPredicted> selectSysPredictedList(SysPredicted sysPredicted)
    {
        return sysPredictedMapper.selectSysPredictedList(sysPredicted);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertSysPredicted(SysPredicted sysPredicted)
    {
        return sysPredictedMapper.insertSysPredicted(sysPredicted);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param sysPredicted 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateSysPredicted(SysPredicted sysPredicted)
    {
        return sysPredictedMapper.updateSysPredicted(sysPredicted);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param predictedIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPredictedByPredictedIds(Long[] predictedIds)
    {
        return sysPredictedMapper.deleteSysPredictedByPredictedIds(predictedIds);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param predictedId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteSysPredictedByPredictedId(Long predictedId)
    {
        return sysPredictedMapper.deleteSysPredictedByPredictedId(predictedId);
    }

    @Override
    public List<SysPredicted> selectList(SysPredicted sysPredicted) {
        String condition = " " ;
        //排序条件
        if(sysPredicted.getSpare3()!= null && sysPredicted.getSpare2()!= null){
            if(sysPredicted.getSpare3().equals("ascending")){
                condition = " asc" ;
            }else if (sysPredicted.getSpare3().equals("descending")){
                condition = " desc" ;
            }
            if(sysPredicted.getSpare2().equals("systemFamily")){
                condition = " system_family" + condition ;
            }else if(sysPredicted.getSpare2().equals("proteinIds")){
                condition = " protein_ids" + condition ;
            }else if(sysPredicted.getSpare2().equals("protein")){
                condition = " protein" + condition ;
            }else if(sysPredicted.getSpare2().equals("inhibitedType")){
                condition = " inhibited_type" + condition ;
            }else if(sysPredicted.getSpare2().equals("phage")){
                condition = " phage" + condition ;
            }else if(sysPredicted.getSpare2().equals("host")){
                condition = " host" + condition ;
            }else if(sysPredicted.getSpare2().equals("length")){
                condition = " CONVERT(length,signed)" + condition ;
            }else if(sysPredicted.getSpare2().equals("cankaowenxian")){
                condition = " cankaowenxian" + condition ;
            }
            condition = "order by " + condition;

        }
        sysPredicted.setSpare3(condition);
        return sysPredictedMapper.selectList(sysPredicted);
    }

    @Override
    public List<SysPredicted> selectSortList(SysPredicted sysPredicted) {
        //排序条件
        String condition = " " ;
        if(sysPredicted.getSpare2().equals("ascending")){
            condition = " asc" ;
        }else if (sysPredicted.getSpare2().equals("descending")){
            condition = " desc" ;
        }

        if(sysPredicted.getSpare1().equals("systemFamily")){
            condition = " system_family" + condition ;
        }else if(sysPredicted.getSpare1().equals("proteinIds")){
            condition = " protein_ids" + condition ;
        }else if(sysPredicted.getSpare1().equals("protein")){
            condition = " protein" + condition ;
        }else if(sysPredicted.getSpare1().equals("inhibitedType")){
            condition = " inhibited_type" + condition ;
        }else if(sysPredicted.getSpare1().equals("phage")){
            condition = " phage" + condition ;
        }else if(sysPredicted.getSpare1().equals("host")){
            condition = " host" + condition ;
        }else if(sysPredicted.getSpare1().equals("length")){
            condition = " CONVERT(length,signed)" + condition ;
        }else if(sysPredicted.getSpare1().equals("cankaowenxian")){
            condition = " cankaowenxian" + condition ;
        }
        sysPredicted.setSpare1(condition);
        return sysPredictedMapper.selectSortList(sysPredicted);
    }

    @Override
    public List<SysPredicted> mhselectList(String condition) {
        return sysPredictedMapper.mhselectList(condition);
    }
}
