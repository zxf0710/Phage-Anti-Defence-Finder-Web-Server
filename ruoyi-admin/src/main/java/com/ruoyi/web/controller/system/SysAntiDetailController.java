package com.ruoyi.web.controller.system;

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
import com.ruoyi.system.domain.SysAntiDetail;
import com.ruoyi.system.service.ISysAntiDetailService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-10-21
 */
@RestController
@RequestMapping("/system/detail")
public class SysAntiDetailController extends BaseController
{
    @Autowired
    private ISysAntiDetailService sysAntiDetailService;

    /**
     * 查询【请填写功能名称】列表
     */

    @GetMapping("/list")
    public TableDataInfo list(SysAntiDetail sysAntiDetail)
    {
        startPage();
        List<SysAntiDetail> list = sysAntiDetailService.selectSysAntiDetailList(sysAntiDetail);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysAntiDetail sysAntiDetail)
    {
        List<SysAntiDetail> list = sysAntiDetailService.selectSysAntiDetailList(sysAntiDetail);
        ExcelUtil<SysAntiDetail> util = new ExcelUtil<SysAntiDetail>(SysAntiDetail.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @GetMapping(value = "/{antiDetailId}")
    public AjaxResult getInfo(@PathVariable("antiDetailId") Long antiDetailId)
    {
        return success(sysAntiDetailService.selectSysAntiDetailByAntiDetailId(antiDetailId));
    }

    /**
     * 新增【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAntiDetail sysAntiDetail)
    {
        return toAjax(sysAntiDetailService.insertSysAntiDetail(sysAntiDetail));
    }

    /**
     * 修改【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAntiDetail sysAntiDetail)
    {
        return toAjax(sysAntiDetailService.updateSysAntiDetail(sysAntiDetail));
    }

    /**
     * 删除【请填写功能名称】
     */
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{antiDetailIds}")
    public AjaxResult remove(@PathVariable Long[] antiDetailIds)
    {
        return toAjax(sysAntiDetailService.deleteSysAntiDetailByAntiDetailIds(antiDetailIds));
    }
}
