package homes.xss.neo4j.relation;

import homes.xss.neo4j.node.GraphNode;
import homes.xss.neo4j.node.SecLeftNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "graph_relation")
public class GraphRelation implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private Integer targetPort;
    private String protocol;
    private String icon;
    @StartNode
    private GraphNode start;
    @EndNode
    private SecLeftNode end;
}
