package finalproject.controller;

import finalproject.entity.Properties;
import finalproject.service.PropertiesService;
import finalproject.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/properties")
public class PropertiesController {

    @Autowired
    private PropertiesService propertiesService;

    @PostMapping("/add")
    private Result add(@RequestBody Properties properties) {
        try {
            return propertiesService.add(properties);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @GetMapping("/getById")
    private Result getById(Integer id) {
        try {
            return propertiesService.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @PutMapping("/update")
    private Result update(@RequestBody Properties properties) {
        try {
            return propertiesService.update(properties);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }
}
