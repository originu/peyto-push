package peyto.push.worker.push;

public interface PushNotificator {

	// common
	public static final String KEY_MESSAGE		= "msg";
	public static final String KEY_MESSAGE_ID	= "msgId";
	public static final String KEY_BADGE		= "badge";
	
	// gcm
	public static final String KEY_HAS_BINARY	= "hasBin";
	
	// apns
	
	
	
	public void startup();
	public void shutdown();
	public void activate();
	public void deactivate();
	public void handle(SinglePushNotificationMessage message);
	public void handle(MultiPushNotificationMessage message);

}
