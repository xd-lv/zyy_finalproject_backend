package finalproject.controller;

import finalproject.service.LogService;
import finalproject.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    @CrossOrigin(origins = "http://localhost:9528")
    @GetMapping("getAllLog")
    private Result getAllLog() {
        try {
            return logService.getAllLog();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError();
        }
    }
}
