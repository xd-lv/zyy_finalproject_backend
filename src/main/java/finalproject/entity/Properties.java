package finalproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Properties {
    private Integer id;
    private Integer nodeId;
    private String mac;
    private String protocol;
    private String deviceId;
    private String manufacturer;
    private String servicePath;
    private String ip;
    private String onlineRange;
    private String lastRange;
    private String department;
    private String manager;
    private String authorityTime;
    private String authorityLevel;
    private Date createTime;
    private Date updateTime;
}
