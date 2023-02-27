package finalproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Node {
    private Integer id;
    private Integer edgeId;
    private String edgeName;
    private String nodeName;
    private String desc;
    private String mac;

    private Integer gpu;

    /** 状态（1-未发布，2-已发布，不能修改） */
    private Integer status;

    private Integer memory;

    private Integer cpu;

    /** 是否系统通用（0-否，1-是） */
    private Integer isSys;

    /** 设备类型（1-直连设备、2-网关子设备、3-网关设备） */
    private Integer deviceType;

    /** 联网方式（1=-wifi、2-蜂窝(2G/3G/4G/5G)、3-以太网、4-其他） */
    private Integer networkMethod;

    /** 是否启用授权码（0-否，1-是） */
    private Integer isAuthorize;

    private Date createTime;
    private Date updateTime;

}
