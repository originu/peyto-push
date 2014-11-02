package peyto.push.worker.push.apns;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import peyto.push.dto.PushAPNSCertDTO;
import peyto.push.worker.push.MultiPushNotificationMessage;
import peyto.push.worker.push.PushNotificator;
import peyto.push.worker.push.SinglePushNotificationMessage;

public class SimpleNotnoopAPNSNotificator implements PushNotificator {

	private static Logger	logger	= LoggerFactory.getLogger( SimpleNotnoopAPNSNotificator.class );

	private PushAPNSCertDTO	cert;
	
	public SimpleNotnoopAPNSNotificator( PushAPNSCertDTO pushCert ) {
		cert = pushCert;
	}
	
	@Override
	public void startup() {
		
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
