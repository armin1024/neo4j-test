package homes.xss.neo4j.entity;//关系实体类
import lombok.Data;
import java.io.Serializable;
import java.util.Map;

@Data
public class Neo4jBaiscRelation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * id
     */
    private Long id;

    /**
     * 标签
     */
    private String type;

    /**
     * 标签属性
     */
    private Map<String, Object> property;
}

