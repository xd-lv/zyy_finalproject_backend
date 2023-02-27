package finalproject.controller;

import finalproject.entity.Edge;
import finalproject.service.ClusterService;
import finalproject.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cluster")
public class ClusterController {

    @Autowired
    private ClusterService clusterService;


    @GetMapping("/listEdge")
    private Result listEdge() {
        try {
            return clusterService.listEdge();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @PostMapping("/createEdge")
    private Result createEdge(@RequestBody Edge edge) {
        try {
            return clusterService.createEdge(edge);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @GetMapping("/listNode")
    private Result listNode() {
        try {
            return clusterService.listNode();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @GetMapping("/listDevice")
    private Result listDevice() {
        try {
            return clusterService.listDevice();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }
}
