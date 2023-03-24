package finalproject.entity.vo;

import finalproject.entity.GeneralModelService;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class GeneralModelServiceStatusVO
{
    private Integer modelServiceId;

    private String modelServiceName;

    private Integer modelServiceStatus;

    public static Map<String, GeneralModelServiceStatusVO> modelServiceToModelServiceStatusVO(List<GeneralModelService> modelServices)
    {
        Map<String, GeneralModelServiceStatusVO> modelServiceStatusVOs = new HashMap<>();
        for (GeneralModelService modelService : modelServices) {
            GeneralModelServiceStatusVO generalModelServiceStatusVO = new GeneralModelServiceStatusVO();
            generalModelServiceStatusVO.setModelServiceId(modelService.getModelServiceId());
            generalModelServiceStatusVO.setModelServiceName(modelService.getModelServiceName());
            generalModelServiceStatusVO.setModelServiceStatus(modelService.getState());
            modelServiceStatusVOs.put(generalModelServiceStatusVO.getModelServiceId().toString(), generalModelServiceStatusVO);
        }
        return modelServiceStatusVOs;
    }
}
