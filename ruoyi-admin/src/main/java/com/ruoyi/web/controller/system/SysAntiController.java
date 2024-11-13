package com.ruoyi.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.SysPredicted;
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
import com.ruoyi.system.domain.SysAnti;
import com.ruoyi.system.service.ISysAntiService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-10-21
 */
@RestController
@RequestMapping("/system/anti")
public class SysAntiController extends BaseController
{
    @Autowired
    private ISysAntiService sysAntiService;

    /**
     * 查询【请填写功能名称】列表
     */
    @GetMapping("/list")
    public TableDataInfo list(SysAnti sysAnti)
    {
        startPage();
        List<SysAnti> list = sysAntiService.selectSysAntiList(sysAnti);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAnti sysAnti)
    {
        List<SysAnti> list = sysAntiService.selectSysAntiList(sysAnti);
        ExcelUtil<SysAnti> util = new ExcelUtil<SysAnti>(SysAnti.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */

    @GetMapping(value = "/{antiId}")
    public AjaxResult getInfo(@PathVariable("antiId") Long antiId)
    {
        return success(sysAntiService.selectSysAntiByAntiId(antiId));
    }

    /**
     * 新增【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAnti sysAnti)
    {
        return toAjax(sysAntiService.insertSysAnti(sysAnti));
    }

    /**
     * 修改【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAnti sysAnti)
    {
        return toAjax(sysAntiService.updateSysAnti(sysAnti));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{antiIds}")
    public AjaxResult remove(@PathVariable Long[] antiIds)
    {
        return toAjax(sysAntiService.deleteSysAntiByAntiIds(antiIds));
    }

    @GetMapping("/mhselect/{condition}")
    public TableDataInfo mhselect(@PathVariable String condition)
    {
        startPage();
        List<SysAnti> list = sysAntiService.mhselectList(condition);
        return getDataTable(list);
    }
}
