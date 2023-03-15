package finalproject.mapper;


import finalproject.entity.Node;

import java.util.List;

public interface NodeMapper {
    List<Node> listNode();
    int countNodeByEdge(Integer id);
    int create(Node node);
    int updateNode(Node node);
}
