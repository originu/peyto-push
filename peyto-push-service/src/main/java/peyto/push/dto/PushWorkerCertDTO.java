package peyto.push.dto;

public class PushWorkerCertDTO {

	private String workerId;
	private String appId;
	private boolean useGcm;
	private boolean activatedGcm;
	private int gcmCertId;
	private boolean useApns;
	private boolean activatedApns;
	private int apnsCertId;

	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public boolean isUseGcm() {
		return useGcm;
	}
	public void setUseGcm(boolean useGcm) {
		this.useGcm = useGcm;
	}
	public boolean isActivatedGcm() {
		return activatedGcm;
	}
	public void setActivatedGcm(boolean activatedGcm) {
		this.activatedGcm = activatedGcm;
	}
	public int getGcmCertId() {
		return gcmCertId;
	}
	public void setGcmCertId(int gcmCertId) {
		this.gcmCertId = gcmCertId;
	}
	public boolean isUseApns() {
		return useApns;
	}
	public void setUseApns(boolean useApns) {
		this.useApns = useApns;
	}
	public boolean isActivatedApns() {
		return activatedApns;
	}
	public void setActivatedApns(boolean activatedApns) {
		this.activatedApns = activatedApns;
	}
	public int getApnsCertId() {
		return apnsCertId;
	}
	public void setApnsCertId(int apnsCertId) {
		this.apnsCertId = apnsCertId;
	}
	@Override
	public String toString() {
		return "PushWorkerCertDTO [workerId=" + workerId + ", appId=" + appId
				+ ", useGcm=" + useGcm + ", activatedGcm=" + activatedGcm
				+ ", gcmCertId=" + gcmCertId + ", useApns=" + useApns
				+ ", activatedApns=" + activatedApns + ", apnsCertId="
				+ apnsCertId + "]";
	}
	
}
