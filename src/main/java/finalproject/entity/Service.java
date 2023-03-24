package finalproject.entity;
import lombok.Data;
import java.sql.Timestamp;
@Data
public class Service {
    private Integer modelServiceId;
    private String modelServiceName;
    private String modelServiceDesc;
    private Integer userId;
    private Integer modelId;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Integer state;
    private Integer replicas;
    private String resourceCpu;
    private String resourceGpu;
    private String resourceMem;
    private String hostname;
    private String path;
    private String argoWorkflowName;
    private String callExample;
}
