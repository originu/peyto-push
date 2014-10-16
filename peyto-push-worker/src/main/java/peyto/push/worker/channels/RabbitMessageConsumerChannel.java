package peyto.push.worker.channels;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMessageConsumerChannel implements MessageListener {

	@Override
	public void onMessage(Message message) {
		try {
//			System.out.println( new String( message.getBody() ) );
//			
//			ObjectMapper	mapper	= new ObjectMapper();
//			JsonNode readTree = mapper.readTree( message.getBody() );
//			
////			BinaryNode binaryNode = JsonNodeFactory.instance.binaryNode( message.getBody() );
//			
//			String pushMsg = readTree.findValue( "msg" ).asText();
//			String pushKey = readTree.findValue( "pushKey" ).asText();
//			
//			PushGCMCertDTO	cert	= new PushGCMCertDTO();
//			cert.setCertDelayWhileIdle( false );
//			cert.setCertApiKey( "AIzaSyCKRNR2wyVpzzx520jE-wCGXIbYzrYNqhg" );
//			cert.setCertProductId( "1059560991536" );
//			cert.setCertRetry( 5 );
//			cert.setCertTimeToLive( 30000 );
//
////			String	pushKey = "APA91bEuXd7ALelUbR3JrOLM5-aCgZQDHRDXwllK3R_s2O3pVRZ2IIlzEICtDyUA9XjR39FojmX4nN2WOPpz-yETgXXneHWOWmrTZVrWIYZThUkP2lLMo4Ee_evjg1LHEhUNd9aeEI5af0OkCKsgjg0OR_J62pG5nA";
//			
//			PushSingleNotificationMessage	msg	= new PushSingleNotificationMessage();
//			msg.setPushKey( pushKey );
//			msg.setMessage( pushMsg );
//			
//			
//			SimpleGCMPushNotificationResolver	resolver	= new SimpleGCMPushNotificationResolver();
//			resolver.setCert(cert);
//			resolver.fireSingleNotification( msg );			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}