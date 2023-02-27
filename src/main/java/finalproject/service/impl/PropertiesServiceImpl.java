package finalproject.service.impl;

import finalproject.entity.Properties;
import finalproject.mapper.PropertiesMapper;
import finalproject.service.PropertiesService;
import finalproject.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PropertiesServiceImpl implements PropertiesService {

    @Resource
    private PropertiesMapper propertiesMapper;

    @Override
    public Result add(Properties properties) {
        return propertiesMapper.add(properties) > 0 ? Result.buildSuccess() : Result.buildError();
    }

    @Override
    public Result update(Properties properties) {
        return propertiesMapper.update(properties) > 0 ? Result.buildSuccess() : Result.buildError();
    }

    @Override
    public Result getById(int id) {
        return Result.buildSuccess(propertiesMapper.getById(id));
    }
}
