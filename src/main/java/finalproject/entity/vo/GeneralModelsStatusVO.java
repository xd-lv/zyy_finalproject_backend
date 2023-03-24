package finalproject.entity.vo;

import finalproject.entity.GeneralModels;
import lombok.Data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class GeneralModelsStatusVO
{
    private Integer modelId;

    private String modelName;

    private Integer modelStatus;

    public static Map<String, GeneralModelsStatusVO> modelsToModelsStatusVO(List<GeneralModels> models)
    {
        Map<String, GeneralModelsStatusVO> modelsStatusVOs = new HashMap<>();
        for (GeneralModels model : models) {
            GeneralModelsStatusVO generalModelsStatusVO = new GeneralModelsStatusVO();
            generalModelsStatusVO.setModelId(model.getModelId());
            generalModelsStatusVO.setModelName(model.getModelName());
            generalModelsStatusVO.setModelStatus(model.getState());
            modelsStatusVOs.put(generalModelsStatusVO.getModelId().toString(), generalModelsStatusVO);
        }
        return modelsStatusVOs;
    }
}
