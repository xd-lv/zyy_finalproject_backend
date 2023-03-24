/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package finalproject.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import finalproject.entity.GeneralModels;
import finalproject.entity.vo.GeneralModelsStatusVO;
import finalproject.service.GeneralModelsService;
import finalproject.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 模型管理表
 *
 * @author pig code generator
 * @date 2021-05-24 14:34:27
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/generalmodels")
@Api(value = "generalmodels", tags = "模型管理表管理")
public class GeneralModelsController
{

    private final GeneralModelsService generalModelsService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param generalModels 模型管理表
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page")
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_get')" )
    public Result getModelsPage(Page page, GeneralModels generalModels, Integer userId)
    {
//        PigUser user = SecurityUtils.getUser(); //获取当前用户
        generalModels.setUserId(userId);
        return Result.buildSuccess(generalModelsService.page(page, Wrappers.query(generalModels).orderByDesc("update_time")));
    }

    /**
     * 通过id查询模型管理表
     *
     * @param modelId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{modelId}")
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_get')" )
    public Result getById(@PathVariable("modelId") Integer modelId)
    {
        return Result.buildSuccess(generalModelsService.getById(modelId));
    }

    /**
     * 新增模型管理表
     *
     * @param generalModels 模型管理表
     * @return R
     */
    @ApiOperation(value = "新增模型管理表", notes = "新增模型管理表")
//    @SysLog("新增模型管理表")
    @PostMapping
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_add')" )
    public Result save(@RequestBody GeneralModels generalModels, Integer userId)
    {
        System.out.println(generalModels);
        if (!generalModelsService.build(generalModels,userId)) {
            Result.buildError("fail to build model");
        }
        return Result.buildSuccess(generalModels);
    }

    /**
     * 修改模型管理表
     *
     * @param generalModels 模型管理表
     * @return R
     */
    @ApiOperation(value = "修改模型管理表", notes = "修改模型管理表")
//    @SysLog("修改模型管理表")
    @PutMapping
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_edit')" )
    public Result updateById(@RequestBody GeneralModels generalModels)
    {
        return Result.buildSuccess(generalModelsService.updateById(generalModels));
    }

    /**
     * 通过id删除模型管理表
     *
     * @param modelId id
     * @return R
     */
    @ApiOperation(value = "通过id删除模型管理表", notes = "通过id删除模型管理表")
//    @SysLog("通过id删除模型管理表")
    @DeleteMapping("/{modelId}")
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_del')" )
    public Result removeById(@PathVariable Integer modelId)
    {
        return Result.buildSuccess(generalModelsService.removeById(modelId));
    }

    /**
     * 构建模型
     *
     * @param modelId id
     * @return R
     */
    @ApiOperation(value = "构建模型", notes = "构建模型")
    //@SysLog("构建模型" )
    @GetMapping("/buildmodel")
    //@PreAuthorize("@pms.hasPermission('aiPlatform_models_build')" )
    public Result BuildModel(@RequestParam("modelId") Integer modelId, Integer userId)
    {
        return Result.buildSuccess("111111");
//        return Result.buildSuccess(generalModelsService.build(generalModelsService.getById(modelId),userId));
        //return R.ok("111111");
    }

    /**
     * 查看用户所有模型打包状态
     *
     * @return R
     */
    @ApiOperation(value = "查看用户所有模型打包状态", notes = "查看用户所有模型打包状态")
//    @SysLog("查看用户所有模型打包状态")
    @GetMapping("/allStatus")
//    @PreAuthorize("@pms.hasPermission('aiPlatform_notebook_add')" )
    public Result getAllStatus(Integer userId)
    {
//        PigUser user = SecurityUtils.getUser(); //获取当前用户
//        if (ObjectUtil.isNull(user)) {
//            return R.ok();
//        }
        GeneralModels queryObj = new GeneralModels();
        queryObj.setUserId(userId);
        List<GeneralModels> models = generalModelsService.list(Wrappers.query(queryObj));

        return Result.buildSuccess(GeneralModelsStatusVO.modelsToModelsStatusVO(models));
    }
}