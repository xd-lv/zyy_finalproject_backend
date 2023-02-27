package finalproject.service;

import finalproject.entity.Properties;
import finalproject.util.Result;

public interface PropertiesService {
    Result add(Properties properties);
    Result update(Properties properties);
    Result getById(int id);
}
