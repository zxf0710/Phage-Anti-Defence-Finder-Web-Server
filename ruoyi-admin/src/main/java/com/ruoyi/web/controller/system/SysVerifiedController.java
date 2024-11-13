package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.SysPredicted;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysVerified;
import com.ruoyi.system.service.ISysVerifiedService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@RestController
@RequestMapping("/system/verified")
public class SysVerifiedController extends BaseController
{
    @Autowired
    private ISysVerifiedService sysVerifiedService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysVerified sysVerified)
    {
        startPage();
        List<SysVerified> list = sysVerifiedService.selectSysVerifiedList(sysVerified);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysVerified sysVerified)
    {
        List<SysVerified> list = sysVerifiedService.selectSysVerifiedList(sysVerified);
        ExcelUtil<SysVerified> util = new ExcelUtil<SysVerified>(SysVerified.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:query')")
    @GetMapping(value = "/{verifiedId}")
    public AjaxResult getInfo(@PathVariable("verifiedId") Long verifiedId)
    {
        return success(sysVerifiedService.selectSysVerifiedByVerifiedId(verifiedId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysVerified sysVerified)
    {
        return toAjax(sysVerifiedService.insertSysVerified(sysVerified));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysVerified sysVerified)
    {
        return toAjax(sysVerifiedService.updateSysVerified(sysVerified));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:verified:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{verifiedIds}")
    public AjaxResult remove(@PathVariable Long[] verifiedIds)
    {
        return toAjax(sysVerifiedService.deleteSysVerifiedByVerifiedIds(verifiedIds));
    }

    //
    /**
     * 条件查询列表
     */
    //@PreAuthorize("@ss.hasPermi('system:predicted:list')")
    @GetMapping("/selectlist")
    public TableDataInfo selectlist(SysVerified sysVerified)
    {
        startPage();
        List<SysVerified> list = sysVerifiedService.selectList(sysVerified);
        return getDataTable(list);
    }
    /**
     * 查询列表排序
     */
    @GetMapping("/sortlist")
    public TableDataInfo sortlist(SysVerified sysVerified)
    {
        startPage();
        List<SysVerified> list = sysVerifiedService.selectSortList(sysVerified);
        return getDataTable(list);
    }

    /**
     * 模糊查询
     */
    @GetMapping("/mhselect/{condition}")
    public TableDataInfo mhselect(@PathVariable String condition)
    {
        startPage();
        List<SysVerified> list = sysVerifiedService.mhselectList(condition);
        return getDataTable(list);
    }

}
