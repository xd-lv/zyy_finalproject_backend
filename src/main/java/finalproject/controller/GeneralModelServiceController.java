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

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import finalproject.entity.GeneralModelService;
import finalproject.entity.GeneralModels;
import finalproject.entity.param.GeneralModelServiceParam;
import finalproject.entity.vo.GeneralModelServiceStatusVO;
import finalproject.service.GeneralModelServiceService;
import finalproject.service.GeneralModelsService;
import finalproject.service.impl.GeneralModelServiceServiceImpl;
import finalproject.service.impl.GeneralModelsServiceImpl;
import finalproject.util.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 模型服务管理表
 *
 * @author pig code generator
 * @date 2021-06-19 14:54:16
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/generalmodelservice")
@Api(value = "modelservice", tags = "模型服务管理表管理")
public class GeneralModelServiceController
{

    private final GeneralModelServiceService generalModelServiceService;

    private final GeneralModelsService generalModelsService;

    /**
     * 分页查询
     *
     * @param page 分页对象
     * @param modelService 模型服务管理表
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page")
    public Result getModelServicePage(Page page, GeneralModelService modelService, Integer userId)
    {
        modelService.setUserId(userId);
        return Result.buildSuccess(generalModelServiceService.page(page, Wrappers.query(modelService)));
    }

    /**
     * 通过id查询模型服务管理表
     *
     * @param modelServiceId id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{modelServiceId}")
    public Result getById(@PathVariable("modelServiceId") Integer modelServiceId)
    {
        return Result.buildSuccess(generalModelServiceService.getById(modelServiceId));
    }

    /**
     * 新增模型服务管理表
     *
     * @param generalModelService 模型服务管理表
     * @return R
     */
    @ApiOperation(value = "新增模型服务管理表", notes = "新增模型服务管理表")
    @PostMapping
    public Result save(@RequestBody GeneralModelService generalModelService, Integer userId)
    {
        if (!generalModelServiceService.create(generalModelService,userId)) {
            return Result.buildError("fail to create model service");
        }
        return Result.buildSuccess();
    }

    /**
     * 修改模型服务管理表
     *
     * @param generalModelService 模型服务管理表
     * @return R
     */
    @ApiOperation(value = "修改模型服务管理表", notes = "修改模型服务管理表")
    @PutMapping
    public Result updateById(@RequestBody GeneralModelService generalModelService)
    {
        return Result.buildSuccess(generalModelServiceService.updateById(generalModelService));
    }

    /**
     * 通过id删除模型服务管理表
     *
     * @param modelServiceId id
     * @return R
     */
    @ApiOperation(value = "通过id删除模型服务管理表", notes = "通过id删除模型服务管理表")
    @DeleteMapping("/{modelServiceId}")
    public Result removeById(@PathVariable Integer modelServiceId)
    {
        return Result.buildSuccess(generalModelServiceService.removeById(modelServiceId));
    }

    /**
     * 上线模型服务
     *
     * @param generalModelService 模型服务管理表
     * @return R
     */
    @ApiOperation(value = "上线模型服务", notes = "上线模型服务")
    @PostMapping("/online")
    public Result online(@RequestBody GeneralModelService generalModelService, Integer userId)
    {
//       online
        return Result.buildSuccess();
    }

    /**
     * 下线模型服务
     *
     * @param modelService 模型服务管理表
     * @return R
     */
    @ApiOperation(value = "下线模型服务", notes = "下线模型服务")
    @PostMapping("/offline")
    public Result offline(@RequestBody GeneralModelService modelService, Integer userId)
    {
//       offline
        return Result.buildSuccess();
    }

    /**
     * 查看用户所有模型服务状态
     *
     * @return R
     */
    @ApiOperation(value = "查看用户所有模型服务状态", notes = "查看用户所有模型服务状态")
    @GetMapping("/allStatus")
    public Result getAllStatus(Integer userId)
    {
        GeneralModelService queryObj = new GeneralModelService();
        queryObj.setUserId(userId);
        List<GeneralModelService> modelServices = generalModelServiceService.list(Wrappers.query(queryObj));
        return Result.buildSuccess(GeneralModelServiceStatusVO.modelServiceToModelServiceStatusVO(modelServices));
    }

    /**
     * 查看用户所有模型
     *
     * @return R
     */
    @ApiOperation(value = "查看用户所有模型", notes = "查看用户所有模型")
    @GetMapping("/getModelList")
    public Result getModelList(Integer userId)
    {
        GeneralModels queryObj = new GeneralModels();
        queryObj.setUserId(userId);
        List<GeneralModels> models = generalModelsService.list(Wrappers.query(queryObj));
        List<JSONObject> modelList = new ArrayList<>();
        for (GeneralModels model : models) {
            JSONObject modelInfo = new JSONObject();
            modelInfo.put("label", model.getModelName());
            modelInfo.put("value", model.getModelId());
            modelList.add(modelInfo);
        }
        return Result.buildSuccess(modelList);
    }

}
