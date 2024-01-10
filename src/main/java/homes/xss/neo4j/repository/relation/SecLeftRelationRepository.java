package homes.xss.neo4j.repository.relation;

import homes.xss.neo4j.relation.SecLeftRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecLeftRelationRepository extends Neo4jRepository<SecLeftRelation, Long> {
}
