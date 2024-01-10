package homes.xss.neo4j.relation;

import homes.xss.neo4j.node.SecLeftNode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RelationshipEntity(type = "sec_left_relation")
public class SecLeftRelation implements Serializable {
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
    private SecLeftNode start;
    @EndNode
    private SecLeftNode end;
}
