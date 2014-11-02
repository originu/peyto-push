package peyto.push.worker.push;

import java.util.concurrent.ConcurrentHashMap;

import peyto.push.common.types.PushType;

public class PushAppNotificatorContext {

	private ConcurrentHashMap< PushType, PushNotificator > pushCertMap;
	
	public PushAppNotificatorContext() {
		pushCertMap	= new ConcurrentHashMap< PushType, PushNotificator >();
	}
	
	public void put( PushType pushType, PushNotificator pushNotificator ) {
		pushCertMap.put( pushType, pushNotificator );
	}
	
	public PushNotificator get( PushType pushType ) {
		return pushCertMap.get( pushType );
	}

	public void remove( PushType pushType ) {
		pushCertMap.remove( pushType );
	}
	
	public void startup( PushType pushType ) {
		pushCertMap.get( pushType ).startup();
	}

	public void shutdown( PushType pushType ) {
		pushCertMap.get( pushType ).shutdown();
	}

	public void activate( PushType pushType ) {
		pushCertMap.get( pushType ).activate();
	}
	
	public void deactivate( PushType pushType ) {
		pushCertMap.get( pushType ).deactivate();
	}

	public void startup() {
		for( PushNotificator noti : pushCertMap.values() ) {
			noti.startup();
		}
	}

	public void shutdown() {
		for( PushNotificator noti : pushCertMap.values() ) {
			noti.shutdown();
		}
	}
	
}
