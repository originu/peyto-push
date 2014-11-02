package peyto.push.worker.push;

import org.springframework.beans.factory.annotation.Autowired;


public class DefaultPushCoreEngineWorker {

	@Autowired
	private DefaultPushAppContext	context;
	
	public void process( SinglePushNotificationMessage message ) {
		PushAppNotificatorContext appCertInfo = context.getAppNotificatorContext( message.getAppId() );
		appCertInfo.get( message.getPushType() );
		
	}

}
