package finalproject.service;

import finalproject.entity.Edge;
import finalproject.entity.Node;
import finalproject.util.Result;

public interface ClusterService {
    Result listNode();
    Result listDevice();
    Result listEdge();
    Result createEdge(Edge edge);
    Result createNode(Node node);
    Result updateNode(Node node);
}
