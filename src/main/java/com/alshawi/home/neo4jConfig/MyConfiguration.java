package com.alshawi.home.neo4jConfig;
/*

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//@Configuration
//@EnableNeo4jRepositories(basePackages = "com.alshawi.home.repository")
//@EnableTransactionManagement
@Configuration
@ComponentScan({"com.alshawi.home"})
@EnableNeo4jRepositories("com.alshawi.home.repository")
@EnableTransactionManagement
public class MyConfiguration extends Neo4jConfiguration {

    @Override
	@Bean
    public Neo4jServer neo4jServer() {
        return new RemoteServer("http://localhost:7474","neo4j","1");
    }

    @Override
	@Bean
	public SessionFactory getSessionFactory() {
    	return new SessionFactory("com.alshawi.home.nodes");
	}
    @Override
	@Bean
    @Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Session getSession() throws Exception {
        return super.getSession();
    }
}
*/
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.server.Neo4jServer;
import org.springframework.data.neo4j.server.RemoteServer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// tag::config[]
@EnableTransactionManagement
@Import(RepositoryRestMvcConfiguration.class)
@EnableScheduling
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.alshawi.home.repository.services"})
@Configuration
@EnableNeo4jRepositories(basePackages = "com.alshawi.home.repository")
public class MyConfiguration extends Neo4jConfiguration {

    public static final String URL = System.getenv("NEO4J_URL") != null ? System.getenv("NEO4J_URL") : "http://localhost:7474";

    @Override
    public Neo4jServer neo4jServer() {
        return new RemoteServer(URL,"neo4j","1");
    }

    @Override
    public SessionFactory getSessionFactory() {
        return new SessionFactory("com.alshawi.home.nodes");
    }
}