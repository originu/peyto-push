package peyto.push.worker.push;

import peyto.push.common.types.PushType;

public abstract class PushNotificationMessage {

	private String appId;
	private PushType pushType;
	private String message;
	private boolean hasBinary;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean hasBinary() {
		return hasBinary;
	}
	public void setHasBinary(boolean hasBinary) {
		this.hasBinary = hasBinary;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public PushType getPushType() {
		return pushType;
	}
	public void setPushType(PushType pushType) {
		this.pushType = pushType;
	}

	
}
