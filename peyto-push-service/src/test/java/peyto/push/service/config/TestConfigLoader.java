package peyto.push.service.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import peyto.push.service.Peyto;


/**
*
* @PropertySources(@PropertySource("classpath:path/to/config"))
* http://www.javacodegeeks.com/2013/11/how-to-using-propertysource-annotation-in-spring-4-with-java-7.html
* 
* @author kevin
*
*/
@Configuration
@PropertySources(value={@PropertySource("app-config-${" + Peyto.SPRING_PROFILES_ACTIVE + "}.properties")})
//@PropertySources(value={@PropertySource("app-config-${" + Peyto.SPRING_PROFILES_ACTIVE + "}.properties")})
public class TestConfigLoader {

	@Autowired
	private Environment	env;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
//	@Bean
//	public PeytoConfig config() {
//		return new PeytoConfig();
//	}
	
	@Value( "${main.db.driver.class.name}" )
	public String DB_DRIVER_CLASS_NAME;
	@Value( "${main.db.url}" )
	public String DB_URL;
	@Value( "${main.db.username}" )
	public String DB_USERNAME;
	@Value( "${main.db.password}" )
	public String DB_PASSWORD;

	@Value( "${main.jndi.name.datasource}" )
	public String JNDI_NAME_DATASOURCE;
	
	@Value( "${main.mybatis.config.location}" )
	public String MYBATIS_CONFIG_LOCATION;

	@Value( "${main.mybatis.mapper.locations}" )
	public List< String > MABATIS_MAPPER_LOCATIONS;
}
