package peyto.push.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
*
* @PropertySources(@PropertySource("classpath:path/to/config"))
* http://www.javacodegeeks.com/2013/11/how-to-using-propertysource-annotation-in-spring-4-with-java-7.html
* 
* @author kevin
*
*/
@Configuration
@PropertySource( "app-config-${spring.profiles.active}.properties" )
//@PropertySource( "file:${PEYTO_HOME}/peyto-push-admin/conf/app-config-${spring.profiles.active}.properties" )
public class TestPropertySourceLoader {

	@Autowired
	private Environment	env;
	
}
