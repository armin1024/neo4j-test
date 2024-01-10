package homes.xss.neo4j.repository.node;

import homes.xss.neo4j.node.SecLeftNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLeftNodeRepository extends Neo4jRepository<SecLeftNode, Long> {
}
