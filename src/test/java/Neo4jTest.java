import homes.xss.neo4j.Neo4jApp;
import homes.xss.neo4j.entity.Neo4jBasicNode;
import homes.xss.neo4j.utils.Neo4jUtils;
import org.assertj.core.util.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Collections;


@RunWith(SpringRunner.class)
@ComponentScan("homes.xss.neo4j")
@SpringBootTest(classes = Neo4jApp.class)
public class Neo4jTest {
    @Resource
    private Neo4jUtils neo4jUtils;

    @Test
    public void test() {
        Neo4jBasicNode node = new Neo4jBasicNode();
        node.setLabels(Arrays.asList("xss")); //list中数据多个代表一个节点有多个label标签
//        node.setProperty(Maps.newHashMap("name", "徐某人"));
//        boolean node1 = neo4jUtils.createNode(node, true);
//        System.out.println(node1);
        Integer integer = neo4jUtils.delNode(node);
        System.out.println(integer);
    }

}
