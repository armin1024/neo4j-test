package homes.xss.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

import java.util.List;

@Data
@NodeEntity("sec")
public class Sec {

    @Id
    @GeneratedValue
    private Long id;

    @Property("name")
    private String name;

    @Property("ip")
    private List<String> ip;

}
