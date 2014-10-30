package peyto.push.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import peyto.push.service.api.PushAPNSCertsService;
import peyto.push.service.api.PushGCMCertsService;
import peyto.push.service.api.PushKeysService;
import peyto.push.service.impl.BasicPushAPNSCertsService;
import peyto.push.service.impl.BasicPushGCMCertsService;
import peyto.push.service.impl.BasicPushKeysService;
import peyto.push.service.impl.BasicPushServersService;
import peyto.push.service.impl.BasicPushWorkersCertsService;
import peyto.push.service.impl.BasicPushWorkersService;

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
	public BasicPushServersService basicPushsServersService() {
		return new BasicPushServersService();
	}

	@Bean
	public BasicPushWorkersCertsService basicPushWorkersCertsService() {
		return new BasicPushWorkersCertsService();
	}

	@Bean
	public BasicPushWorkersService basicPushWorkersService() {
		return new BasicPushWorkersService();
	}
	
}

