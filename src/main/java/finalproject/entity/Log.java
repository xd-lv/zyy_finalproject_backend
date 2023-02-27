package finalproject.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Log {
    private Integer id;
    private Date date;
    private String level;
    private String content;
}
