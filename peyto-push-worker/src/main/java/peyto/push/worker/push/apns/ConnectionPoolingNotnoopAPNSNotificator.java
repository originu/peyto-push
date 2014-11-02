package peyto.push.worker.push.apns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import peyto.push.dto.PushGCMCertDTO;
import peyto.push.worker.push.MultiPushNotificationMessage;
import peyto.push.worker.push.PushNotificator;
import peyto.push.worker.push.SinglePushNotificationMessage;

public class ConnectionPoolingNotnoopAPNSNotificator implements PushNotificator {

	private static Logger	logger	= LoggerFactory.getLogger( ConnectionPoolingNotnoopAPNSNotificator.class );

	private PushGCMCertDTO	cert;
	
	public ConnectionPoolingNotnoopAPNSNotificator() {
//		cert	= ( PushGCMCertDTO ) pushCert;
	}
	
	@Override
	public void startup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void deactivate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handle( SinglePushNotificationMessage message ) {
		
	}

	@Override
	public void handle( MultiPushNotificationMessage message ) {

	}

	
}
