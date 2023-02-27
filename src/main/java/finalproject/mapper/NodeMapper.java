package finalproject.mapper;


import finalproject.entity.Node;

import java.util.List;

public interface NodeMapper {
    List<Node> listNode();
    int countNodeByEdge(Integer id);
}
