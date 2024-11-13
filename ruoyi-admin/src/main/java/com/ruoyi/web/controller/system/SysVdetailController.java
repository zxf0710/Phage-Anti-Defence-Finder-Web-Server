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
import com.ruoyi.system.domain.SysVdetail;
import com.ruoyi.system.service.ISysVdetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-04-17
 */
@RestController
@RequestMapping("/system/vdetail")
public class SysVdetailController extends BaseController
{
    @Autowired
    private ISysVdetailService sysVdetailService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysVdetail sysVdetail)
    {
        startPage();
        List<SysVdetail> list = sysVdetailService.selectSysVdetailList(sysVdetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysVdetail sysVdetail)
    {
        List<SysVdetail> list = sysVdetailService.selectSysVdetailList(sysVdetail);
        ExcelUtil<SysVdetail> util = new ExcelUtil<SysVdetail>(SysVdetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:query')")
    @GetMapping(value = "/{verifiedDetailId}")
    public AjaxResult getInfo(@PathVariable("verifiedDetailId") Long verifiedDetailId)
    {
        return success(sysVdetailService.selectSysVdetailByVerifiedDetailId(verifiedDetailId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysVdetail sysVdetail)
    {
        return toAjax(sysVdetailService.insertSysVdetail(sysVdetail));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysVdetail sysVdetail)
    {
        return toAjax(sysVdetailService.updateSysVdetail(sysVdetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:vdetail:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{verifiedDetailIds}")
    public AjaxResult remove(@PathVariable Long[] verifiedDetailIds)
    {
        return toAjax(sysVdetailService.deleteSysVdetailByVerifiedDetailIds(verifiedDetailIds));
    }

    /**
     * 根据蛋白质id查询详细信息
     */

    @PostMapping(value = "/{proteinIds}")
    public AjaxResult selectSysVdetailByProteinIds(@PathVariable("proteinIds") String proteinIds)
    {
        return success(sysVdetailService.selectSysVdetailByProteinIds(proteinIds));
    }

}
