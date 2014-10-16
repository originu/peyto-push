package peyto.push.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import peyto.push.service.api.PushKeysService;
import peyto.push.service.impl.BasicPushKeysService;

@Configuration
//@ComponentScan( "peyto.push.service.impl" )
public class TestServiceConfig {

	@Bean
	public PushKeysService basicPushKeysService() {
		return new BasicPushKeysService();
	}
	
}

