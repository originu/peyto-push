package peyto.push.worker.push;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;

import peyto.push.common.types.PushType;
import peyto.push.dto.PushWorkerCertDTO;
import peyto.push.service.impl.BasicPushWorkersCertsService;

public class DefaultPushAppContext {

	// hard coding
	String	workerId	= "workerId::0";

	@Autowired
	private BasicPushWorkersCertsService	workersCertsService;
	
	@Autowired
	private DefaultPushAppNotificatorContextFactory	notificatorContextFactory;
	
	// appId, PushAppNotificatorContext
	private ConcurrentHashMap< String, PushAppNotificatorContext >	pushAppNotificatorContextMap;
	
	public PushAppNotificatorContext getAppNotificatorContext( String appId ) {
		return pushAppNotificatorContextMap.get( appId );
	}

	// by spring
	public void startup() {
		pushAppNotificatorContextMap	= new ConcurrentHashMap< String, PushAppNotificatorContext >();
		List< PushWorkerCertDTO > workderCerts = workersCertsService.getByWorkerId( workerId );
		for ( PushWorkerCertDTO workerCert : workderCerts ) {
			PushAppNotificatorContext context = notificatorContextFactory.create( workerCert );
			pushAppNotificatorContextMap.put( workerCert.getAppId(), context );
		}
		for ( PushAppNotificatorContext context : pushAppNotificatorContextMap.values() ) {
			context.startup();
		}
	}

	// by spring
	public void shutdown() {
		for ( PushAppNotificatorContext context : pushAppNotificatorContextMap.values() ) {
			context.shutdown();
		}
		pushAppNotificatorContextMap.clear();
		pushAppNotificatorContextMap	= null;
	}

	public void add( String appId, PushType pushType, int certId ) {
		PushNotificator	notificator	= notificatorContextFactory.create( pushType, certId );
		PushAppNotificatorContext pushAppNotificatorContext = pushAppNotificatorContextMap.get( appId );
		if ( pushAppNotificatorContext != null ) {
			pushAppNotificatorContext.put( pushType, notificator );
		} else {
			PushAppNotificatorContext	context	= new PushAppNotificatorContext();
			context.put( pushType, notificator );
			pushAppNotificatorContextMap.put( appId, context );
		}
		notificator.startup();
	}

	public void remove( String appId, PushType pushType, int certId ) {
		PushAppNotificatorContext	context = pushAppNotificatorContextMap.get( appId );
		PushNotificator pushNotificator = context.get( pushType );
		pushNotificator.deactivate();
		pushNotificator.shutdown();
		pushAppNotificatorContextMap.remove( appId );
	}

	public void activate(String appId, PushType pushType, int certId) {
		PushAppNotificatorContext context = pushAppNotificatorContextMap.get( appId );
		PushNotificator pushNotificator = context.get( pushType );
		pushNotificator.activate();
	}

	public void deactivate(String appId, PushType pushType, int certId) {
		PushAppNotificatorContext context = pushAppNotificatorContextMap.get( appId );
		PushNotificator pushNotificator = context.get( pushType );
		pushNotificator.deactivate();
	}

}