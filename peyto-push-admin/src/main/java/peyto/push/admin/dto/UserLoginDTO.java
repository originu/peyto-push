package peyto.push.admin.dto;

public class UserLoginDTO {

	private String userId;
	private String userPw;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	@Override
	public String toString() {
		return "UserLoginDTO [userId=" + userId + ", userPw=" + userPw + "]";
	}
	
}
