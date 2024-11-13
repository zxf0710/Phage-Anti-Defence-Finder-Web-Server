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
import com.ruoyi.system.domain.Sociodemographicfactorsbool;
import com.ruoyi.system.service.ISociodemographicfactorsboolService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-11-10
 */
@RestController
@RequestMapping("/system/sociodemographicfactorsbool")
public class SociodemographicfactorsboolController extends BaseController
{
    @Autowired
    private ISociodemographicfactorsboolService sociodemographicfactorsboolService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:list')")
    @GetMapping("/list")
    public TableDataInfo list(Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        startPage();
        List<Sociodemographicfactorsbool> list = sociodemographicfactorsboolService.selectSociodemographicfactorsboolList(sociodemographicfactorsbool);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        List<Sociodemographicfactorsbool> list = sociodemographicfactorsboolService.selectSociodemographicfactorsboolList(sociodemographicfactorsbool);
        ExcelUtil<Sociodemographicfactorsbool> util = new ExcelUtil<Sociodemographicfactorsbool>(Sociodemographicfactorsbool.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:query')")
    @GetMapping(value = "/{elderlyId}")
    public AjaxResult getInfo(@PathVariable("elderlyId") String elderlyId)
    {
        return success(sociodemographicfactorsboolService.selectSociodemographicfactorsboolByElderlyId(elderlyId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        return toAjax(sociodemographicfactorsboolService.insertSociodemographicfactorsbool(sociodemographicfactorsbool));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Sociodemographicfactorsbool sociodemographicfactorsbool)
    {
        return toAjax(sociodemographicfactorsboolService.updateSociodemographicfactorsbool(sociodemographicfactorsbool));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:sociodemographicfactorsbool:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{elderlyIds}")
    public AjaxResult remove(@PathVariable String[] elderlyIds)
    {
        return toAjax(sociodemographicfactorsboolService.deleteSociodemographicfactorsboolByElderlyIds(elderlyIds));
    }
}
