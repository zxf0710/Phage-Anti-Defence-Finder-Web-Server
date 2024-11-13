package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SysSequence;
import com.ruoyi.system.service.ISysSequenceService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2023-04-27
 */
@RestController
@RequestMapping("/system/sequence")
public class SysSequenceController extends BaseController
{
    @Autowired
    private ISysSequenceService sysSequenceService;

    /**
     * 查询【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysSequence sysSequence)
    {
        startPage();
        List<SysSequence> list = sysSequenceService.selectSysSequenceList(sysSequence);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysSequence sysSequence)
    {
        List<SysSequence> list = sysSequenceService.selectSysSequenceList(sysSequence);
        ExcelUtil<SysSequence> util = new ExcelUtil<SysSequence>(SysSequence.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:query')")
    @GetMapping(value = "/{fileId}")
    public AjaxResult getInfo(@PathVariable("fileId") Long fileId)
    {
        return success(sysSequenceService.selectSysSequenceByFileId(fileId));
    }

    /**
     * 新增【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysSequence sysSequence)
    {
        return toAjax(sysSequenceService.insertSysSequence(sysSequence));
    }

    /**
     * 修改【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysSequence sysSequence)
    {
        return toAjax(sysSequenceService.updateSysSequence(sysSequence));
    }

    /**
     * 删除【请填写功能名称】
     */
    //@PreAuthorize("@ss.hasPermi('system:sequence:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{fileIds}")
    public AjaxResult remove(@PathVariable Long[] fileIds)
    {
        return toAjax(sysSequenceService.deleteSysSequenceByFileIds(fileIds));
    }

    //上传fasta文件并执行cmd
    @PutMapping("/upload")
    public int upload(@RequestParam("mail") String mail, @RequestParam("inputFile") MultipartFile inputFile) throws Exception
    {
        sysSequenceService.upload(mail, inputFile);

        return 1;
    }


}
