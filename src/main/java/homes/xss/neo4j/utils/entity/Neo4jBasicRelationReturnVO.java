package homes.xss.neo4j.utils.entity;

import lombok.Data;
import java.io.Serializable;

/**
 * 基础返回关系VO
 * 关系
 */
@Data
public class Neo4jBasicRelationReturnVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Neo4jBasicNode start;
    private Neo4jQueryRelation relationship;
    private Neo4jBasicNode end;
}

