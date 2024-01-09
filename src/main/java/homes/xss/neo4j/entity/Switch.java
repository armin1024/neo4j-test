package homes.xss.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity("switch")
public class Switch {

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

}
