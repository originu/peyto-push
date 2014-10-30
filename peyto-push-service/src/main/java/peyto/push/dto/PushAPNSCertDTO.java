package peyto.push.dto;

import java.util.Arrays;
import java.util.Date;

import peyto.push.common.types.PushType;

public class PushAPNSCertDTO implements PushCert {

	private int apnsCertId;
	private String appId;
	private String appDesc;
	private PushType	pushType;
	private byte[]	certBin;
	private String certPW;	
	private Date certExpDate;
	private Date createdDate;
	
	public int getApnsCertId() {
		return apnsCertId;
	}
	public void setApnsCertId(int apnsCertId) {
		this.apnsCertId = apnsCertId;
	}
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
	public byte[] getCertBin() {
		return certBin;
	}
	public void setCertBin(byte[] certBin) {
		this.certBin = certBin;
	}
	public String getCertPW() {
		return certPW;
	}
	public void setCertPW(String certPW) {
		this.certPW = certPW;
	}
	public Date getCertExpDate() {
		return certExpDate;
	}
	public void setCertExpDate(Date certExpDate) {
		this.certExpDate = certExpDate;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return "PushAPNSCertDTO [apnsCertId=" + apnsCertId + ", appId=" + appId
				+ ", appDesc=" + appDesc + ", pushType=" + pushType
				+ ", certBin=" + Arrays.toString(certBin) + ", certPW="
				+ certPW + ", certExpDate=" + certExpDate + ", createdDate="
				+ createdDate + "]";
	}
	
}
