package homes.xss.neo4j.repository.node;

import homes.xss.neo4j.node.SecRightNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecRightNodeRepository extends Neo4jRepository<SecRightNode, Long> {
}
