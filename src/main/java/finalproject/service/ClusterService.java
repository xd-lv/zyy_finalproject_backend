package finalproject.service;

import finalproject.entity.Edge;
import finalproject.util.Result;

public interface ClusterService {
    Result listNode();
    Result listDevice();
    Result listEdge();
    Result createEdge(Edge edge);
}
