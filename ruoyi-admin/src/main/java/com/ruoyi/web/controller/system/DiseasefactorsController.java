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
import com.ruoyi.system.domain.Diseasefactors;
import com.ruoyi.system.service.IDiseasefactorsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-11-10
 */
@RestController
@RequestMapping("/system/diseasefactors")
public class DiseasefactorsController extends BaseController
{
    @Autowired
    private IDiseasefactorsService diseasefactorsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:list')")
    @GetMapping("/list")
    public TableDataInfo list(Diseasefactors diseasefactors)
    {
        startPage();
        List<Diseasefactors> list = diseasefactorsService.selectDiseasefactorsList(diseasefactors);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Diseasefactors diseasefactors)
    {
        List<Diseasefactors> list = diseasefactorsService.selectDiseasefactorsList(diseasefactors);
        ExcelUtil<Diseasefactors> util = new ExcelUtil<Diseasefactors>(Diseasefactors.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:query')")
    @GetMapping(value = "/{patientId}")
    public AjaxResult getInfo(@PathVariable("patientId") String patientId)
    {
        return success(diseasefactorsService.selectDiseasefactorsByPatientId(patientId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Diseasefactors diseasefactors)
    {
        return toAjax(diseasefactorsService.insertDiseasefactors(diseasefactors));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Diseasefactors diseasefactors)
    {
        return toAjax(diseasefactorsService.updateDiseasefactors(diseasefactors));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:diseasefactors:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{patientIds}")
    public AjaxResult remove(@PathVariable String[] patientIds)
    {
        return toAjax(diseasefactorsService.deleteDiseasefactorsByPatientIds(patientIds));
    }
}
