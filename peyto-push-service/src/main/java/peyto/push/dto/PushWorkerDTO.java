package peyto.push.dto;

public class PushWorkerDTO {

	private String workerId;
	private String workerName;
	private String workerDesc;

	public String getWorkerId() {
		return workerId;
	}
	public void setWorkerId(String workerId) {
		this.workerId = workerId;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getWorkerDesc() {
		return workerDesc;
	}
	public void setWorkerDesc(String workerDesc) {
		this.workerDesc = workerDesc;
	}
	@Override
	public String toString() {
		return "PushWorkerDTO [workerId=" + workerId + ", workerName="
				+ workerName + ", workerDesc=" + workerDesc + "]";
	}

}
