package homes.xss.neo4j.node;

import lombok.Data;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

import java.io.Serializable;

@Data
public class Node implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

}
