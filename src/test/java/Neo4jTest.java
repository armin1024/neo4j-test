import homes.xss.neo4j.Neo4jApp;
import homes.xss.neo4j.node.GraphNode;
import homes.xss.neo4j.node.SecLeftNode;
import homes.xss.neo4j.node.SecNode;
import homes.xss.neo4j.node.SecRightNode;
import homes.xss.neo4j.relation.GraphRelation;
import homes.xss.neo4j.relation.LeftSecRelation;
import homes.xss.neo4j.relation.LinkRelation;
import homes.xss.neo4j.relation.SecLeftRelation;
import homes.xss.neo4j.repository.node.GraphNodeRepository;
import homes.xss.neo4j.repository.node.SecLeftNodeRepository;
import homes.xss.neo4j.repository.node.SecNodeRepository;
import homes.xss.neo4j.repository.node.SecRightNodeRepository;
import homes.xss.neo4j.repository.relation.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@ComponentScan("homes.xss.neo4j")
@SpringBootTest(classes = Neo4jApp.class)
public class Neo4jTest {
    @Resource
    private GraphNodeRepository graphNodeRepository;
    @Resource
    private SecLeftNodeRepository secLeftNodeRepository;
    @Resource
    private SecRightNodeRepository secRightNodeRepository;
    @Resource
    private SecNodeRepository secNodeRepository;
    @Resource
    private GraphRelationRepository graphRelationRepository;
    @Resource
    private LeftSecRelationRepository leftSecRelationRepository;
    @Resource
    private RightSecRelationRepository rightSecRelationRepository;
    @Resource
    private SecLeftRelationRepository secLeftRelationRepository;
    @Resource
    private SecRightRelationRepository secRightRelationRepository;
    @Resource
    private LinkRelationRepository linkRelationRepository;

    @Test
    public void testAddNode() {
//        node();
        List<Map<String, Object>> query = linkRelationRepository.query("match (n:test) delete n;");
        Iterable<GraphNode> all = graphNodeRepository.findAll();

    }


    private void node() {
        GraphNode graphNode = graphNodeRepository
                .save(new GraphNode("信息安全管理平台H5页面", "https", "anyi.tf.cn", 443, "/sec/secops/form"));
        GraphNode graphNode2 = graphNodeRepository
                .save(new GraphNode("AOPS", "https", "anyi.tf.cn", 443, "/aops"));
        SecLeftNode switchNode = secLeftNodeRepository
                .save(new SecLeftNode("交换机", "switch", null, "icon"));
        SecLeftNode zbdNode = secLeftNodeRepository
                .save(new SecLeftNode("重保盾", "zbd", Arrays.asList("99.3.4.174"), "icon"));
        SecLeftNode tyNode = secLeftNodeRepository
                .save(new SecLeftNode("天眼", "ty", Arrays.asList("99.3.4.174"), "icon"));
        SecLeftNode f5Node = secLeftNodeRepository
                .save(new SecLeftNode("F5", "f5", Arrays.asList("218.88.113.207", "101.207.127.174"), "icon"));
        SecLeftNode sslNode = secLeftNodeRepository
                .save(new SecLeftNode("SSL", "ssl", Arrays.asList("172.64.9.125", "172.64.9.225"), "icon"));
        SecLeftNode ctNode = secLeftNodeRepository
                .save(new SecLeftNode("长亭", "ct", Arrays.asList("99.3.4.174"), "icon"));
        SecNode secNode = secNodeRepository
                .save(new SecNode("安全平台", "sec", Arrays.asList("172.64.9.20"), "icon"));
        SecRightNode lmNode = secRightNodeRepository
                .save(new SecRightNode("绿盟", "lm", Arrays.asList("99.3.4.86", "99.3.4.87"), "icon"));
        SecRightNode serverNode = secRightNodeRepository
                .save(new SecRightNode("业务服务器", "server", Arrays.asList("99.3.4.86"), "icon"));
        System.out.println(graphNode);
        System.out.println(graphNode2);
        System.out.println(switchNode);
        System.out.println(zbdNode);
        System.out.println(tyNode);
        System.out.println(f5Node);
        System.out.println(sslNode);
        System.out.println(ctNode);
        System.out.println(secNode);
        System.out.println(lmNode);
        System.out.println(serverNode);

        linkRelationRepository.save(new LinkRelation(null, "link", "normal", null, 443, "https", "icon", null, graphNode, switchNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", null, 443, "https", "icon", null, graphNode2, switchNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal",null, 443, "https", "icon", null, switchNode, f5Node));
        linkRelationRepository.save(new LinkRelation(null, "旁路", "bypass", null, null, null, "icon", null, switchNode, zbdNode));
        linkRelationRepository.save(new LinkRelation(null, "探针", "probe", null, null, null, "icon", null, switchNode, tyNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", 443, 20175, "https", "icon", null, f5Node, sslNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", 20175, 20175, "https", "icon", null, sslNode, ctNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", 20175, 20175, "https", "icon", null, ctNode, secNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", 20175, null, null, "icon", null, secNode, lmNode));
        linkRelationRepository.save(new LinkRelation(null, "探针", "probe", null, null, null, "icon", null, lmNode, tyNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", null, 80, "http", "icon", "/sec/secops/form", lmNode, serverNode));
        linkRelationRepository.save(new LinkRelation(null, "link", "normal", null, 80, "http", "icon", "/aops", lmNode, serverNode));
    }

}
