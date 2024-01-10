package homes.xss.neo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity("graph_node")
public class GraphNode extends Node {

    private String name;
    private String protocol;
    private String host;
    private Integer port;
    private String uri;

}
