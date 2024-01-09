package homes.xss.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.List;

@Data
@NodeEntity("f5")
public class F5 {

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

    @Property("ip")
    private List<String> ip;

}
