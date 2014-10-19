package peyto.push.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import peyto.push.service.api.PushAPNSCertsService;
import peyto.push.service.api.PushGCMCertsService;
import peyto.push.service.api.PushKeysService;
import peyto.push.service.impl.BasicPushAPNSCertsService;
import peyto.push.service.impl.BasicPushGCMCertsService;
import peyto.push.service.impl.BasicPushKeysService;
import peyto.push.service.impl.BasicPushsServersService;

@Configuration
//@ComponentScan( "peyto.push.service.impl" )
public class TestServiceConfig {

	@Bean
	public PushKeysService basicPushKeysService() {
		return new BasicPushKeysService();
	}
	
	@Bean
	public PushAPNSCertsService basicPushAPNSCertsService() {
		return new BasicPushAPNSCertsService();
	}

	@Bean
	public PushGCMCertsService basicPushGCMCertsService() {
		return new BasicPushGCMCertsService();
	}
	
	@Bean
	public BasicPushsServersService basicPushsServersService() {
		return new BasicPushsServersService();
	}
	
}

