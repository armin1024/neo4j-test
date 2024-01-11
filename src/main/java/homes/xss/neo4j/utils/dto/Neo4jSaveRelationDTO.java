package homes.xss.neo4j.utils.dto;

import homes.xss.neo4j.utils.entity.Neo4jBaiscRelation;
import homes.xss.neo4j.utils.entity.Neo4jBasicNode;
import lombok.Data;

import java.io.Serializable;

@Data
public class Neo4jSaveRelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Neo4jBasicNode start;
    private Neo4jBasicNode end;
    private Neo4jBaiscRelation relationship;

}
