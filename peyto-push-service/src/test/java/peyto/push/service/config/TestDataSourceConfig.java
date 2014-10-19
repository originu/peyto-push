package peyto.push.service.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;

/**
 * 
 * http://www.javabeat.net/list-of-hibernate-sql-dialects/ -->
 * https://mariadb.com/kb/en/mariadb/client-libraries/mariadb-java-client/about-the-mariadb-java-client/ -->
 * 
 * @author kevin
 *
 */
@Configuration
public class TestDataSourceConfig {
	
	@Autowired
	private Environment	env;
	
	@Bean( name = "mainDataSource" )
	@Profile( "dev" )
	public DataSource dataSource_dev() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName( env.getProperty( "main.db.driver.class.name" ) );
		dataSource.setUrl( env.getProperty( "main.db.url" ) );
		dataSource.setUsername( env.getProperty( "main.db.username" ) );
		dataSource.setPassword( env.getProperty( "main.db.password" ) );
		return dataSource;
	}
	
	@Bean( name = "mainDataSource" )
	@Profile( "pro" )
	public DataSource dataSource_pro() {
		JndiObjectFactoryBean jndiObjectFactoryBean = new JndiObjectFactoryBean();
		jndiObjectFactoryBean.setJndiName( env.getProperty( "main.jndi.name.datasource" ) );
		return ( DataSource ) jndiObjectFactoryBean.getObject(); 
	}
	

	
}