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
import com.ruoyi.system.domain.Balancemobilityfactors;
import com.ruoyi.system.service.IBalancemobilityfactorsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2024-11-10
 */
@RestController
@RequestMapping("/system/balancemobilityfactors")
public class BalancemobilityfactorsController extends BaseController
{
    @Autowired
    private IBalancemobilityfactorsService balancemobilityfactorsService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:list')")
    @GetMapping("/list")
    public TableDataInfo list(Balancemobilityfactors balancemobilityfactors)
    {
        startPage();
        List<Balancemobilityfactors> list = balancemobilityfactorsService.selectBalancemobilityfactorsList(balancemobilityfactors);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Balancemobilityfactors balancemobilityfactors)
    {
        List<Balancemobilityfactors> list = balancemobilityfactorsService.selectBalancemobilityfactorsList(balancemobilityfactors);
        ExcelUtil<Balancemobilityfactors> util = new ExcelUtil<Balancemobilityfactors>(Balancemobilityfactors.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:query')")
    @GetMapping(value = "/{elderlyId}")
    public AjaxResult getInfo(@PathVariable("elderlyId") String elderlyId)
    {
        return success(balancemobilityfactorsService.selectBalancemobilityfactorsByElderlyId(elderlyId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Balancemobilityfactors balancemobilityfactors)
    {
        return toAjax(balancemobilityfactorsService.insertBalancemobilityfactors(balancemobilityfactors));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Balancemobilityfactors balancemobilityfactors)
    {
        return toAjax(balancemobilityfactorsService.updateBalancemobilityfactors(balancemobilityfactors));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:balancemobilityfactors:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{elderlyIds}")
    public AjaxResult remove(@PathVariable String[] elderlyIds)
    {
        return toAjax(balancemobilityfactorsService.deleteBalancemobilityfactorsByElderlyIds(elderlyIds));
    }
}
