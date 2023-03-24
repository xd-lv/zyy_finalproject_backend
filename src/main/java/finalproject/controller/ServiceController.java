package finalproject.controller;
import finalproject.entity.Service;
import finalproject.service.ServiceService;
import finalproject.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;
@RestController
@RequestMapping("/generalmodelservice")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @GetMapping("page")
    private Result listModelService(){
        try {
            return serviceService.listModelService();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError();
        }
    }
}
