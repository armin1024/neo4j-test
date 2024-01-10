package homes.xss.neo4j.repository.node;

import homes.xss.neo4j.node.SecNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecNodeRepository extends Neo4jRepository<SecNode, Long> {
}
