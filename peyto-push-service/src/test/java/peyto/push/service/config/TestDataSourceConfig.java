package peyto.push.service.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import peyto.push.common.PeytoConfig;

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
	private PeytoConfig	config;
	
	@Bean
	@Qualifier( "mainDataSource" )
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName( config.DB_DRIVER_CLASS_NAME );
		dataSource.setUrl( config.DB_URL );
		dataSource.setUsername( config.DB_USERNAME );
		dataSource.setPassword( config.DB_PASSWORD );
		return dataSource;
	}
	
}