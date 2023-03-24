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

package finalproject.service;

import com.baomidou.mybatisplus.extension.service.IService;
import finalproject.entity.GeneralModelService;

/**
 * 模型服务管理表
 *
 * @author pig code generator
 * @date 2021-06-19 14:54:16
 */
public interface GeneralModelServiceService
        extends IService<GeneralModelService>
{
    boolean create(GeneralModelService modelService, Integer userId);

    boolean online(GeneralModelService modelService);

    void offline(GeneralModelService modelService);
}
