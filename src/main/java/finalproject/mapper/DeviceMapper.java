package finalproject.mapper;


import finalproject.entity.Device;

import java.util.List;

public interface DeviceMapper {
    List<Device> listDevice();
    int countDeviceByEdge(Integer id);
}
