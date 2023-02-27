package finalproject.service.impl;

import finalproject.mapper.LogMapper;
import finalproject.service.LogService;
import finalproject.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LogServiceImp implements LogService {

    @Resource
    private LogMapper logMapper;

    @Override
    public Result getAllLog() {
        return Result.buildSuccess(logMapper.getAllLog());
    }
}
