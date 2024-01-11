package homes.xss.neo4j.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class RelationDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String relationLabelName;
    private String startLabelName;
    private String endLabelName;
    private Map<String, Object> startNodeProperties;
    private Map<String, Object> relationProperties;
    private Map<String, Object> endNodeProperties;
    private Object level;
}
