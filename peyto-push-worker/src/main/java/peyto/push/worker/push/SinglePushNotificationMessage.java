package peyto.push.worker.push;

public class SinglePushNotificationMessage extends PushNotificationMessage {

	private String pushKey;

	public String getPushKey() {
		return pushKey;
	}

	public void setPushKey(String pushKey) {
		this.pushKey = pushKey;
	}
	
}
