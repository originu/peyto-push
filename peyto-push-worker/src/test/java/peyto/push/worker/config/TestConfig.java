package peyto.push.worker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import peyto.push.worker.controllers.APNSAppCertController;
import peyto.push.worker.controllers.GCMAppCertController;
import peyto.push.worker.push.DefaultPushAppContext;
import peyto.push.worker.push.DefaultPushAppNotificatorContextFactory;
import peyto.push.worker.push.DefaultPushCoreEngineWorker;

@Configuration
//@ComponentScan( basePackages = "peyto.push.worker.controllers" )
public class TestConfig {

	@Bean( initMethod = "startup", destroyMethod = "shutdown" )
	public DefaultPushAppContext pushAppCertContext() {
		return new DefaultPushAppContext(); 
	}

	@Bean
	public GCMAppCertController gcmAppCertController() {
		return new GCMAppCertController();
	}
	
	@Bean
	public APNSAppCertController apnsAppCertController() {
		return new APNSAppCertController();
	}

	@Bean
	public DefaultPushCoreEngineWorker pushCoreEngine() {
		return new DefaultPushCoreEngineWorker();
	}
	
	@Bean
	public DefaultPushAppNotificatorContextFactory pushAppNotificatorFactory() {
		return new DefaultPushAppNotificatorContextFactory();
	}
	
}
