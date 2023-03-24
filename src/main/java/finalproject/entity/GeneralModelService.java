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
 * 模型服务管理表
 *
 * @author pig code generator
 * @date 2021-07-20 13:09:12
 */
@Data
@TableName("general_model_service")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "模型服务管理表")
public class GeneralModelService
        extends Model<GeneralModelService>
{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    @ApiModelProperty(value = "主键")
    private Integer modelServiceId;
    /**
     * 模型服务名称
     */
    @ApiModelProperty(value = "模型服务名称")
    private String modelServiceName;
    /**
     * 模型服务描述
     */
    @ApiModelProperty(value = "模型服务描述")
    private String modelServiceDesc;
    /**
     * 所属用户ID
     */
    @ApiModelProperty(value = "所属用户ID")
    private Integer userId;
    /**
     * 模型ID
     */
    @ApiModelProperty(value = "模型ID")
    private Integer modelId;
    /**
     * 模型服务创建时间
     */
    @ApiModelProperty(value = "模型服务创建时间")
    private LocalDateTime createTime;
    /**
     * 模型服务更新时间
     */
    @ApiModelProperty(value = "模型服务更新时间")
    private LocalDateTime updateTime;
    /**
     * 服务状态：0-未上线, 1-上线中, 2-已上线, 3-下线中
     */
    @ApiModelProperty(value = "服务状态：0-未上线, 1-上线中, 2-已上线, 3-下线中")
    private Integer state;
    /**
     * 实例数
     */
    @ApiModelProperty(value = "实例数")
    private Integer replicas;
    /**
     * CPU资源配置
     */
    @ApiModelProperty(value = "CPU资源配置")
    private String resourceCpu;
    /**
     * GPU资源配置
     */
    @ApiModelProperty(value = "GPU资源配置")
    private String resourceGpu;
    /**
     * 内存资源配置
     */
    @ApiModelProperty(value = "内存资源配置")
    private String resourceMem;
    /**
     * hostname
     */
    @ApiModelProperty(value = "hostname")
    private String hostname;
    /**
     * path
     */
    @ApiModelProperty(value = "path")
    private String path;
    /**
     * argo workflow name
     */
    @ApiModelProperty(value = "argo workflow name")
    private String argoWorkflowName;
    /**
     * 调用示例
     */
    @ApiModelProperty(value = "调用示例")
    private String callExample;
}
