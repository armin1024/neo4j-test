package homes.xss.neo4j.entity;//查询关系的时候返回的对象封装的实体类
import lombok.Data;
import java.io.Serializable;
import java.util.Map;

@Data
public class Neo4jQueryRelation implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    /**
     * 开始节点id
     */
    private Long start;
    /**
     * 结束节点id
     */
    private Long end;
    /**
     * 关系类型
     */
    private String type;
    /**
     * id
     */
    private Long identity;

    /**
     * 标签属性
     */
    private Map<String, Object> properties;
}

