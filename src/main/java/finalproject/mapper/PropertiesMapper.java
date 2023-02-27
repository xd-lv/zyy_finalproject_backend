package finalproject.mapper;

import finalproject.entity.Properties;

public interface PropertiesMapper {
    int add(Properties properties);
    int update(Properties properties);
    Properties getById(int id);
}
