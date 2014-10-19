package peyto.push.dto;

import java.util.Date;

import peyto.push.common.types.PushType;


public class PushGCMCertDTO {

	private String appId;
	private String appDesc;
	private PushType	pushType;
	private String certApiKey;
	private String certProductId;
	private boolean certDelayWhileIdle;
	private int certRetry;
	private int certTimeToLive;
	private String certGMail;	
	private Date createdDate;
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppDesc() {
		return appDesc;
	}
	public void setAppDesc(String appDesc) {
		this.appDesc = appDesc;
	}
	public PushType getPushType() {
		return pushType;
	}
	public void setPushType(PushType pushType) {
		this.pushType = pushType;
	}
	public String getCertApiKey() {
		return certApiKey;
	}
	public void setCertApiKey(String certApiKey) {
		this.certApiKey = certApiKey;
	}
	public String getCertProductId() {
		return certProductId;
	}
	public void setCertProductId(String certProductId) {
		this.certProductId = certProductId;
	}
	public boolean isCertDelayWhileIdle() {
		return certDelayWhileIdle;
	}
	public void setCertDelayWhileIdle(boolean certDelayWhileIdle) {
		this.certDelayWhileIdle = certDelayWhileIdle;
	}
	public int getCertRetry() {
		return certRetry;
	}
	public void setCertRetry(int certRetry) {
		this.certRetry = certRetry;
	}
	public int getCertTimeToLive() {
		return certTimeToLive;
	}
	public void setCertTimeToLive(int certTimeToLive) {
		this.certTimeToLive = certTimeToLive;
	}
	public String getCertGMail() {
		return certGMail;
	}
	public void setCertGMail(String certGMail) {
		this.certGMail = certGMail;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "PushGCMCertDTO [appId=" + appId + ", appDesc=" + appDesc
				+ ", pushType=" + pushType + ", certApiKey=" + certApiKey
				+ ", certProductId=" + certProductId + ", certDelayWhileIdle="
				+ certDelayWhileIdle + ", certRetry=" + certRetry
				+ ", certTimeToLive=" + certTimeToLive + ", certGMail="
				+ certGMail + ", createdDate=" + createdDate + "]";
	}
	
}
