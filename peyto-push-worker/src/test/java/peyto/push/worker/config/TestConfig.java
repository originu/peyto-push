package peyto.push.worker.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import peyto.push.worker.push.DefaultPushAppCertContext;

@Configuration
public class TestConfig {

	@Bean
	public DefaultPushAppCertContext pushAppCertContext() {
		return new DefaultPushAppCertContext(); 
	}
}
