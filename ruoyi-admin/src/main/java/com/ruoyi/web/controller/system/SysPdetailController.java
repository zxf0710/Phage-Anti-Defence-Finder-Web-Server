package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysPdetail;
import com.ruoyi.system.service.ISysPdetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@RestController
@RequestMapping("/system/pdetail")
public class SysPdetailController extends BaseController
{
    @Autowired
    private ISysPdetailService sysPdetailService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPdetail sysPdetail)
    {
        startPage();
        List<SysPdetail> list = sysPdetailService.selectSysPdetailList(sysPdetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPdetail sysPdetail)
    {
        List<SysPdetail> list = sysPdetailService.selectSysPdetailList(sysPdetail);
        ExcelUtil<SysPdetail> util = new ExcelUtil<SysPdetail>(SysPdetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:query')")
    @GetMapping(value = "/{predictedDetailId}")
    public AjaxResult getInfo(@PathVariable("predictedDetailId") Long predictedDetailId)
    {
        return success(sysPdetailService.selectSysPdetailByPredictedDetailId(predictedDetailId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysPdetail sysPdetail)
    {
        return toAjax(sysPdetailService.insertSysPdetail(sysPdetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysPdetail sysPdetail)
    {
        return toAjax(sysPdetailService.updateSysPdetail(sysPdetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:pdetail:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{predictedDetailIds}")
    public AjaxResult remove(@PathVariable Long[] predictedDetailIds)
    {
        return toAjax(sysPdetailService.deleteSysPdetailByPredictedDetailIds(predictedDetailIds));
    }


    /**
     * 根据蛋白质id查询详细信息
     */

    @PostMapping(value = "/{proteinIds}")
    public AjaxResult selectSysPdetailByProteinIds(@PathVariable("proteinIds") String proteinIds)
    {
        return success(sysPdetailService.selectSysPdetailByProteinIds(proteinIds));
    }
}
