package finalproject.mapper;


import finalproject.entity.Edge;

import java.util.List;

public interface EdgeMapper {
    List<Edge> listEdge();
    Edge getById(int id);
    int create(Edge edge);
}
