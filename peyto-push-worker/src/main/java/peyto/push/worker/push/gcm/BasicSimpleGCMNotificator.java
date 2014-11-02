package peyto.push.worker.push.gcm;

import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import peyto.push.dto.PushGCMCertDTO;
import peyto.push.worker.push.MultiPushNotificationMessage;
import peyto.push.worker.push.PushNotificator;
import peyto.push.worker.push.SinglePushNotificationMessage;

import com.google.android.gcm.server.Constants;
import com.google.android.gcm.server.InvalidRequestException;
import com.google.android.gcm.server.Message;
import com.google.android.gcm.server.Message.Builder;
import com.google.android.gcm.server.MulticastResult;
import com.google.android.gcm.server.Result;
import com.google.android.gcm.server.Sender;

public class BasicSimpleGCMNotificator implements PushNotificator {

	private static Logger	logger	= LoggerFactory.getLogger( BasicSimpleGCMNotificator.class );

	private PushGCMCertDTO	cert;
	
	public BasicSimpleGCMNotificator( PushGCMCertDTO pushCert ) {
		cert	= pushCert;
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
		Builder	msg	= new Message.Builder();
		msg.timeToLive( cert.getCertTimeToLive() );
		msg.delayWhileIdle( cert.isCertDelayWhileIdle() );
		msg.addData( KEY_MESSAGE, message.getMessage() );
		msg.addData( KEY_MESSAGE_ID, message.getMessage() );
		msg.addData( KEY_HAS_BINARY, String.valueOf( message.hasBinary() ) );
		Message build = msg.build();
		Sender	sender	= new Sender( cert.getCertApiKey() );
		try {
			// message, pushkey, retry
			Result result = sender.send( build, message.getPushKey(), cert.getCertRetry() );
			processResult( result );
		} catch (IllegalArgumentException e) {
//			IllegalArgumentException - if registrationId is null.
			
		} catch (InvalidRequestException e) {
//			InvalidRequestException - if GCM didn't returned a 200 or 503 status.

		} catch (IOException e) {
//			IOException - if message could not be sent.
		}	
	}

	public void handle( MultiPushNotificationMessage message ) {
		Builder	msg	= new Message.Builder();
		msg.timeToLive( cert.getCertTimeToLive() );
		msg.delayWhileIdle( cert.isCertDelayWhileIdle() );
		msg.addData( KEY_MESSAGE, message.getMessage() );
		msg.addData( KEY_MESSAGE_ID, message.getMessage() );
		msg.addData( KEY_HAS_BINARY, String.valueOf( message.hasBinary() ) );
		Message build = msg.build();
		Sender	sender	= new Sender( cert.getCertApiKey() );
		try {
			// message, pushkey, retry
			MulticastResult send = sender.send( build, message.getPushKeys(), cert.getCertRetry() );
			List<Result> results = send.getResults();
			for ( Result result : results ) {
				processResult( result );
			}
		} catch (IllegalArgumentException e) {
//			IllegalArgumentException - if registrationId is null.
			
		} catch (InvalidRequestException e) {
//			InvalidRequestException - if GCM didn't returned a 200 or 503 status.

		} catch (IOException e) {
//			IOException - if message could not be sent.
		}
	}
	
	private void processResult( Result result ) {
		if ( result.getMessageId() != null ) {
			String canonicalRegistrationId = result.getCanonicalRegistrationId();
			if ( canonicalRegistrationId != null ) {
//				makeError( pushResponseMessage, pushMessage, 
//						ResultCodeType.FAIL_1007_ONE_REGISTRATION_ID_SAME_DEVICE, 
//						"same device has more than one registration ID: update database, CanonicalRegistrationId=" + canonicalRegId,
//						", " );
			} else {
				// success
//				pushResponseMessage.setResult( true );
//				pushResponseMessage.setResultCode( ResultCodeType.SUCCESS_0000_SENT_PUSH_MESSAGES.getResultCode() );
//				pushResponseMessage.setResultMessage( ResultCodeType.SUCCESS_0000_SENT_PUSH_MESSAGES.toString() );
//				logger.info( "success to send GCM Push Message = " +  pushMessage );
			}
		} else{
			String errorCodeName = result.getErrorCodeName();
			if ( errorCodeName.equals( Constants.ERROR_NOT_REGISTERED ) || errorCodeName.equals( Constants.ERROR_INVALID_REGISTRATION ) ) { 
				// application has been removed from device - unregister, database
//				makeError( pushResponseMessage, pushMessage, 
//						ResultCodeType.FAIL_1005_UNINSTALLED_APPLICATION_FROM_DEVICE, 
//						"application has been removed from device, update database, GCM ErrorCodeName=" + errorCodeName,
//						", " +  errorCodeName );
			} else {
//				makeError( pushResponseMessage, pushMessage, 
//						ResultCodeType.FAIL_1006_GCM_SEND_ERROR, 
//						"check productKey and apiKey and others, GCM ErrorCodeName=" + errorCodeName,
//						", " +  errorCodeName );
			}
		}		
	}
	
}
