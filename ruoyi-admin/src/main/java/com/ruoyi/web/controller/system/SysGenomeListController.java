package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysGenomeList;
import com.ruoyi.system.service.ISysGenomeListService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-05-07
 */
@RestController
@RequestMapping("/system/list")
public class SysGenomeListController extends BaseController
{
    @Autowired
    private ISysGenomeListService sysGenomeListService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:list:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysGenomeList sysGenomeList)
    {
        startPage();
        List<SysGenomeList> list = sysGenomeListService.selectSysGenomeListList(sysGenomeList);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:list:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysGenomeList sysGenomeList)
    {
        List<SysGenomeList> list = sysGenomeListService.selectSysGenomeListList(sysGenomeList);
        ExcelUtil<SysGenomeList> util = new ExcelUtil<SysGenomeList>(SysGenomeList.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:list:query')")
    @GetMapping(value = "/{genomeId}")
    public AjaxResult getInfo(@PathVariable("genomeId") Long genomeId)
    {
        return success(sysGenomeListService.selectSysGenomeListByGenomeId(genomeId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:list:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysGenomeList sysGenomeList)
    {
        return toAjax(sysGenomeListService.insertSysGenomeList(sysGenomeList));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:list:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysGenomeList sysGenomeList)
    {
        return toAjax(sysGenomeListService.updateSysGenomeList(sysGenomeList));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:list:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{genomeIds}")
    public AjaxResult remove(@PathVariable Long[] genomeIds)
    {
        return toAjax(sysGenomeListService.deleteSysGenomeListByGenomeIds(genomeIds));
    }

    //上传fasta文件并执行prodigal
    @PutMapping("/gupload")
    public int gupload(@RequestParam("mail") String mail, @RequestParam("inputFile") MultipartFile inputFile) throws Exception
    {
        return sysGenomeListService.gupload(mail, inputFile);
    }
}
