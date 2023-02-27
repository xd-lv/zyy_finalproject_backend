package finalproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Edge {
    private Integer id;
    private String name;
    private String desc;
    private Integer nodeCount;
    private Integer deviceCount;
    private Date createTime;
    private Date updateTime;

}
