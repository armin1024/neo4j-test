package homes.xss.neo4j.repository.relation;

import homes.xss.neo4j.relation.LinkRelation;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface LinkRelationRepository extends Neo4jRepository<LinkRelation, Long> {

    @Query("MATCH (n:Node)-[r]->(b:Node)\n" +
            "WITH\n" +
            "  CASE\n" +
            "    WHEN EXISTS(n.uri) AND n.uri = '/sec/secops/form' THEN n\n" +
            "    WHEN NOT EXISTS(n.uri) THEN n\n" +
            "    ELSE null\n" +
            "  END AS a,\n" +
            "  CASE\n" +
            "    WHEN EXISTS(r.uri) AND r.uri = '/sec/secops/form' THEN r\n" +
            "    WHEN NOT EXISTS(r.uri) THEN r\n" +
            "    ELSE null\n" +
            "  END AS rel,\n" +
            "  b\n" +
            "WHERE a IS NOT NULL AND rel IS NOT NULL\n" +
            "RETURN a, rel, b;\n")
    List<HashMap<String, Object>> query();

}
