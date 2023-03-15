package finalproject.entity;

import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
public class Edge {
    private Integer id;
    private String name;
    private String desc;
    private Integer nodeCount;
    private Integer deviceCount;
    private Timestamp createTime;
    private Timestamp updateTime;

    public Edge() {
    }

    public Edge(Integer id, String name, String desc, Timestamp createTime, Timestamp updateTime) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
