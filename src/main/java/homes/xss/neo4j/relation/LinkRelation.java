package homes.xss.neo4j.relation;

import homes.xss.neo4j.node.Node;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "link")
public class LinkRelation {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private Integer srcPort;
    private Integer targetPort;
    private String protocol;
    private String icon;
    private String uri;
    @StartNode
    private Node start;
    @EndNode
    private Node end;

}
