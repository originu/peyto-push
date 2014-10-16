package peyto.push.worker.push.app;

import java.util.concurrent.ConcurrentHashMap;

import peyto.push.common.pushkeys.PushType;

public class PushAppCertManager {
	
	private ConcurrentHashMap< PushType, IPushNotificationResolver >		pushNotificationResolvers;
	
	public IPushNotificationResolver getPushNotificationResolvers( PushType pushType ) {
		IPushNotificationResolver resolver = pushNotificationResolvers.get( pushType );
		return resolver;
	}
	
	public void setPushNotificationResolvers( PushType pushType, IPushNotificationResolver resolver ) {
		pushNotificationResolvers.put( pushType, resolver );
	}
	
}
