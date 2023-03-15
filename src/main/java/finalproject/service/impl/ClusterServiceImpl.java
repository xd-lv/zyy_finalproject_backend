package finalproject.service.impl;


import finalproject.entity.Device;
import finalproject.entity.Edge;
import finalproject.entity.Node;
import finalproject.mapper.DeviceMapper;
import finalproject.mapper.EdgeMapper;
import finalproject.mapper.NodeMapper;
import finalproject.service.ClusterService;
import finalproject.util.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClusterServiceImpl implements ClusterService {

    @Resource
    private DeviceMapper deviceMapper;

    @Resource
    private NodeMapper nodeMapper;

    @Resource
    private EdgeMapper edgeMapper;

    @Override
    public Result listDevice() {
        List<Device> res = deviceMapper.listDevice();
        for(Device d: res){
            d.setEdgeName(edgeMapper.getById(d.getEdgeId()).getName());
        }
        return Result.buildSuccess(res);
    }

    @Override
    public Result listNode() {
        List<Node> res = nodeMapper.listNode();
        for(Node d: res){
            d.setEdgeName(edgeMapper.getById(d.getEdgeId()).getName());
        }
        return Result.buildSuccess(res);
    }

    @Override
    public Result listEdge() {
        List<Edge> res = edgeMapper.listEdge();
        for(Edge e: res){
            e.setDeviceCount(deviceMapper.countDeviceByEdge(e.getId()));
            e.setNodeCount(nodeMapper.countNodeByEdge(e.getId()));
        }
        return Result.buildSuccess(res);
    }

    @Override
    public Result createEdge(Edge edge) {
        return edgeMapper.create(edge) > 0 ? Result.buildSuccess() : Result.buildError();
    }

    @Override
    public Result createNode(Node node) {
        return nodeMapper.create(node) > 0 ? Result.buildSuccess() : Result.buildError();
    }

    @Override
    public Result updateNode(Node node) {
        return nodeMapper.updateNode(node) > 0? Result.buildSuccess() : Result.buildError();
    }
}
