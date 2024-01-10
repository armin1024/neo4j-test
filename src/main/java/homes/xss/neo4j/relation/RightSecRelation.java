package homes.xss.neo4j.relation;

import homes.xss.neo4j.node.SecLeftNode;
import homes.xss.neo4j.node.SecNode;
import homes.xss.neo4j.node.SecRightNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "left_sec_relation")
public class RightSecRelation implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String type;
    private Integer srcPort;
    private Integer targetPort;
    private String protocol;
    private String icon;
    @StartNode
    private SecNode start;
    @EndNode
    private SecRightNode end;
}
