package homes.xss.neo4j.config;

import lombok.extern.slf4j.Slf4j;
import org.neo4j.driver.Driver;
import org.neo4j.driver.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Slf4j
public class Neo4jCommandLineRunner implements CommandLineRunner {
    private final Driver driver;
    private final ConfigurableApplicationContext applicationContext;
    public final Session session;

    @Bean
    public Session session() {
        return session;
    }

    public Neo4jCommandLineRunner(Driver driver, ConfigurableApplicationContext applicationContext) {
        this.driver = driver;
        this.applicationContext = applicationContext;
        this.session = driver.session();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
