package homes.xss.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

@Data
@NodeEntity("first")
public class First {

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

    @Property("host")
    private String host;

    @Property("domain")
    private Boolean domain;

}
