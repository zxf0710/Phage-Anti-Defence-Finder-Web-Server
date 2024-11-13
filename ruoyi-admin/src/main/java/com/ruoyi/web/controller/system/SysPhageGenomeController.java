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
import com.ruoyi.system.domain.SysPhageGenome;
import com.ruoyi.system.service.ISysPhageGenomeService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-03
 */
@RestController
@RequestMapping("/system/genome")
public class SysPhageGenomeController extends BaseController
{
    @Autowired
    private ISysPhageGenomeService sysPhageGenomeService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysPhageGenome sysPhageGenome)
    {
        startPage();
        List<SysPhageGenome> list = sysPhageGenomeService.selectSysPhageGenomeList(sysPhageGenome);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysPhageGenome sysPhageGenome)
    {
        List<SysPhageGenome> list = sysPhageGenomeService.selectSysPhageGenomeList(sysPhageGenome);
        ExcelUtil<SysPhageGenome> util = new ExcelUtil<SysPhageGenome>(SysPhageGenome.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:query')")
    @GetMapping(value = "/{phageId}")
    public AjaxResult getInfo(@PathVariable("phageId") Long phageId)
    {
        return success(sysPhageGenomeService.selectSysPhageGenomeByPhageId(phageId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysPhageGenome sysPhageGenome)
    {
        return toAjax(sysPhageGenomeService.insertSysPhageGenome(sysPhageGenome));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysPhageGenome sysPhageGenome)
    {
        return toAjax(sysPhageGenomeService.updateSysPhageGenome(sysPhageGenome));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{phageIds}")
    public AjaxResult remove(@PathVariable Long[] phageIds)
    {
        return toAjax(sysPhageGenomeService.deleteSysPhageGenomeByPhageIds(phageIds));
    }

    /**
     * 列表排序
     */
    //@PreAuthorize("@ss.hasPermi('system:genome:list')")
    @GetMapping("/sortlist")
    public TableDataInfo sortlist(SysPhageGenome sysPhageGenome)
    {
        startPage();
        List<SysPhageGenome> list = sysPhageGenomeService.selectSortList(sysPhageGenome);
        return getDataTable(list);
    }


    @GetMapping("/mhselect/{condition}")
    public TableDataInfo mhselect(@PathVariable String condition)
    {
        startPage();
        List<SysPhageGenome> list = sysPhageGenomeService.mhselectList(condition);
        return getDataTable(list);
    }
}
