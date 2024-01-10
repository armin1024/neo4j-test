package homes.xss.neo4j.repository.relation;

import homes.xss.neo4j.relation.LeftSecRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeftSecRelationRepository extends Neo4jRepository<LeftSecRelation, Long> {
}
