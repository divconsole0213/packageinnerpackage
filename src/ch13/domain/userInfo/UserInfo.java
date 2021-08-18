package ch13.domain.userInfo;

public class UserInfo {
	private String userID;
	private String password;
	private String userName;
	
	public UserInfo() {
		
	}
	public UserInfo(String userID, String password, String userName) {
		super();
		this.userID = userID;
		this.password = password;
		this.userName = userName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	

}
