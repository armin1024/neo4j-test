package homes.xss.neo4j.entity.relation;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;

@Data
@RelationshipEntity(type = "link")
public class Link {

    @Id
    @GeneratedValue
    private Long id;
    private String protocol;
    private Integer src;
    private Integer target;


}
