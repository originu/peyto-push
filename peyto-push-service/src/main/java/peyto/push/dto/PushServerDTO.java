package peyto.push.dto;


public class PushServerDTO {

	private String serverId;
	private String serverName;
	private String serverDesc;
	
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public String getServerName() {
		return serverName;
	}
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}
	public String getServerDesc() {
		return serverDesc;
	}
	public void setServerDesc(String serverDesc) {
		this.serverDesc = serverDesc;
	}
	@Override
	public String toString() {
		return "PushServerDTO [serverId=" + serverId + ", serverName="
				+ serverName + ", serverDesc=" + serverDesc + "]";
	}
}
