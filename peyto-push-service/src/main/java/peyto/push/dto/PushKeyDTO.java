package peyto.push.dto;

import java.util.Date;

import peyto.push.common.types.PushOSType;
import peyto.push.common.types.PushType;

public class PushKeyDTO {

	private String	pushkey;
	private String	userId;
	private String	appId;
	private PushType	pushType;
	private PushOSType	osType;
	private int		osVer1;
	private int		osVer2;
	private int		osVer3;
	private String	deviceUid;
	private String	deviceType;
	private String	deviceModel;
	private String	sound;
	private boolean	enabled;
	private Date	createdDate;

	public String getPushkey() {
		return pushkey;
	}
	public void setPushkey(String pushkey) {
		this.pushkey = pushkey;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public PushOSType getOsType() {
		return osType;
	}
	public void setOsType(PushOSType osType) {
		this.osType = osType;
	}
	public int getOsVer1() {
		return osVer1;
	}
	public void setOsVer1(int osVer1) {
		this.osVer1 = osVer1;
	}
	public int getOsVer2() {
		return osVer2;
	}
	public void setOsVer2(int osVer2) {
		this.osVer2 = osVer2;
	}
	public int getOsVer3() {
		return osVer3;
	}
	public void setOsVer3(int osVer3) {
		this.osVer3 = osVer3;
	}
	public String getDeviceUid() {
		return deviceUid;
	}
	public void setDeviceUid(String deviceUid) {
		this.deviceUid = deviceUid;
	}
	public String getDeviceType() {
		return deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}
	public String getDeviceModel() {
		return deviceModel;
	}
	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "PushKeyDTO [pushkey=" + pushkey + ", userId=" + userId
				+ ", appId=" + appId + ", pushType=" + pushType + ", osType="
				+ osType + ", osVer1=" + osVer1 + ", osVer2=" + osVer2
				+ ", osVer3=" + osVer3 + ", deviceUid=" + deviceUid
				+ ", deviceType=" + deviceType + ", deviceModel=" + deviceModel
				+ ", sound=" + sound + ", enabled=" + enabled
				+ ", createdDate=" + createdDate + "]";
	}
}