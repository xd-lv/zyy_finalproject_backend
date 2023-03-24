package finalproject.service.impl;

import finalproject.mapper.ServiceMapper;
import finalproject.service.ServiceService;
import finalproject.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ServiceServiceImpl implements ServiceService {
    @Resource
    private ServiceMapper serviceMapper;
    @Override
    public Result listModelService() {
        return Result.buildSuccess(serviceMapper.listModelService());
    }
}
