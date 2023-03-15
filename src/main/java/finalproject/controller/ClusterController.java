package finalproject.controller;

import finalproject.entity.Edge;
import finalproject.entity.Node;
import finalproject.service.ClusterService;
import finalproject.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Timestamp;

@RestController
@RequestMapping("/cluster")
public class ClusterController {

    @Autowired
    private ClusterService clusterService;


    @CrossOrigin(origins = "http://localhost:9528")
    @GetMapping("/listEdge")
    private Result listEdge() {
        try {
            return clusterService.listEdge();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @CrossOrigin(origins = "http://localhost:9528")
    @PostMapping("/createEdge")
    private Result createEdge(@RequestBody Edge edge) {
        try {
            edge.setCreateTime(new Timestamp(System.currentTimeMillis()));
            Result res =  clusterService.createEdge(edge);
            return res;
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @CrossOrigin(origins = "http://localhost:9528")
    @GetMapping("/listNode")
    private Result listNode() {
        try {
            return clusterService.listNode();
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

    @CrossOrigin(origins = "http://localhost:9528")
    @PostMapping("/createNode")
    private Result createNode(@RequestBody Node node) {
        try{
            node.setStatus(1);
            Result res = clusterService.createNode(node);
            return res;
        } catch(Exception e) {
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

    @PostMapping("/updateNode")
    private Result updateNode(@RequestBody Node node) {
        try {
            return  clusterService.updateNode(node);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.buildError(e.toString());
        }
    }

}
