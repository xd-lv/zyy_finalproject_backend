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
 * 镜像管理表
 *
 * @author pig code generator
 * @date 2021-05-31 20:32:12
 */
@Data
@TableName("image")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "镜像管理表")
public class Image
        extends Model<Image>
{
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId
    @ApiModelProperty(value = "主键")
    private Integer imageId;
    /**
     * 镜像名称
     */
    @ApiModelProperty(value = "镜像名称")
    private String imageName;
    /**
     * 镜像tag
     */
    @ApiModelProperty(value = "镜像tag")
    private String imageTag;
    /**
     * 所属用户ID，0为公共算子镜像，1为Notebook镜像
     */
    @ApiModelProperty(value = "所属用户ID，0为公共算子镜像，1为Notebook镜像")
    private Integer userId;
    /**
     * 创建镜像时间
     */
    @ApiModelProperty(value = "创建镜像时间")
    private LocalDateTime createTime;
    /**
     * 镜像描述
     */
    @ApiModelProperty(value = "镜像描述")
    private String imageDescription;
    /**
     * 备注
     */
    @ApiModelProperty(value = "备注")
    private String remark;
}
