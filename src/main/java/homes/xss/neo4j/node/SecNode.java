package homes.xss.neo4j.node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@NodeEntity("sec_node")
public class SecNode extends Node {

    private String name;
    private String type;
    private List<String> ipAddress;
    private String icon;

}
