package finalproject.entity.param;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class GeneralModelServiceParam
{

    private int modelServiceId;

    private String data;

    private MultipartFile file;
}
