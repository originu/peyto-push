package peyto.push.worker.push;

import java.util.List;

public class MultiPushNotificationMessage extends PushNotificationMessage {

	private List< String >	pushKeys;

	public List< String > getPushKeys() {
		return pushKeys;
	}

	public void setPushKeys(List< String > pushKeys) {
		this.pushKeys = pushKeys;
	}
}
