package homes.xss.neo4j.repository.relation;

import homes.xss.neo4j.relation.SecRightRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecRightRelationRepository extends Neo4jRepository<SecRightRelation, Long> {
}
