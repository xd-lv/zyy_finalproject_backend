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

package finalproject.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 模型管理表
 *
 * @author pig code generator
 * @date 2021-08-27 14:40:17
 */
@Data
@TableName("generalmodels")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "模型管理表")
public class GeneralModels
        extends Model<GeneralModels>
{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    @ApiModelProperty(value = "主键")
    private Integer modelId;
    /**
     * 模型名称
     */
    @ApiModelProperty(value = "模型名称")
    private String modelName;
    /**
     * 模型描述
     */
    @ApiModelProperty(value = "模型描述")
    private String modelDesc;
    /**
     * 模型类型：0-用户自定义模型服务算子, 1-TorchServe, 2-TFServing
     */
    @ApiModelProperty(value = "模型类型：0-用户自定义模型服务算子, 1-TorchServe, 2-TFServing")
    private Integer modelInferenceType;
    /**
     * 模型设置
     */
    @ApiModelProperty(value = "模型设置")
    private String modelInferenceSetting;
    /**
     * 所属用户ID
     */
    @ApiModelProperty(value = "所属用户ID")
    private Integer userId;
    /**
     * 服务状态：0-打包中, 1-打包完成
     */
    @ApiModelProperty(value = "服务状态：0-打包中, 1-打包完成")
    private Integer state;
    /**
     * 模型创建时间
     */
    @ApiModelProperty(value = "模型创建时间")
    private LocalDateTime createTime;
    /**
     * 模型更新时间
     */
    @ApiModelProperty(value = "模型更新时间")
    private LocalDateTime updateTime;
    /**
     * 模型CPU资源
     */
    @ApiModelProperty(value = "模型CPU资源")
    private String runResourceCpu;
    /**
     * 模型GPU资源
     */
    @ApiModelProperty(value = "模型GPU资源")
    private String runResourceGpu;
    /**
     * 模型mem资源
     */
    @ApiModelProperty(value = "模型mem资源")
    private String runResourceMem;
}
