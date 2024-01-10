package homes.xss.neo4j.repository.node;

import homes.xss.neo4j.node.GraphNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphNodeRepository extends Neo4jRepository<GraphNode, Long> {
}
