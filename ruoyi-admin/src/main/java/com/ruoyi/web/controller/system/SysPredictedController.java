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
import com.ruoyi.system.domain.SysPredicted;
import com.ruoyi.system.service.ISysPredictedService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2023-04-17
 */
@RestController
@RequestMapping("/system/predicted")
public class SysPredictedController extends BaseController
{
    @Autowired
    private ISysPredictedService sysPredictedService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPredicted sysPredicted)
    {
        startPage();
        List<SysPredicted> list = sysPredictedService.selectSysPredictedList(sysPredicted);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPredicted sysPredicted)
    {
        List<SysPredicted> list = sysPredictedService.selectSysPredictedList(sysPredicted);
        ExcelUtil<SysPredicted> util = new ExcelUtil<SysPredicted>(SysPredicted.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:query')")
    @GetMapping(value = "/{predictedId}")
    public AjaxResult getInfo(@PathVariable("predictedId") Long predictedId)
    {
        return success(sysPredictedService.selectSysPredictedByPredictedId(predictedId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysPredicted sysPredicted)
    {
        return toAjax(sysPredictedService.insertSysPredicted(sysPredicted));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysPredicted sysPredicted)
    {
        return toAjax(sysPredictedService.updateSysPredicted(sysPredicted));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{predictedIds}")
    public AjaxResult remove(@PathVariable Long[] predictedIds)
    {
        return toAjax(sysPredictedService.deleteSysPredictedByPredictedIds(predictedIds));
    }


    //
    /**
     * 条件查询列表
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:list')")
    @GetMapping("/selectlist")
    public TableDataInfo selectlist(SysPredicted sysPredicted)
    {
        startPage();
        List<SysPredicted> list = sysPredictedService.selectList(sysPredicted);
        return getDataTable(list);
    }

    /**
     * 列表排序
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:list')")
    @GetMapping("/sortlist")
    public TableDataInfo sortlist(SysPredicted sysPredicted)
    {
        startPage();
        List<SysPredicted> list = sysPredictedService.selectSortList(sysPredicted);
        return getDataTable(list);
    }

    /**
     * 模糊查询
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:list')")
    @GetMapping("/mhselect/{condition}")
    public TableDataInfo mhselect(@PathVariable String condition)
    {
        startPage();
        List<SysPredicted> list = sysPredictedService.mhselectList(condition);
        return getDataTable(list);
    }

}
