package peyto.push.worker.push.app;

import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class PushCertManager {

	/**
	 * < appId, PushAppCertManager >
	 */
	private ConcurrentHashMap< String, PushAppCertManager >		appCertManager;
	
	@PostConstruct
	public void startup() {
		appCertManager	= new ConcurrentHashMap< String, PushAppCertManager >();
		
	}
	
	@PreDestroy
	public void shutdown() {
		appCertManager	= null;
	}
	
	public PushAppCertManager getAppCertManager( String appId ) {
		PushAppCertManager pushAppCertManager = appCertManager.get( appId );
		if ( pushAppCertManager == null ) {
			pushAppCertManager	= new PushAppCertManager();
		}
		return pushAppCertManager;
	}
	
}
