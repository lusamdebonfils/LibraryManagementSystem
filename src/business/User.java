package business;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userID;//Unique ID also used in login
	private String userName;
	private String userPassword;
	private UserType type;//User can be admin or librarian
	
	public User(String id,String userName,String userPassword,UserType type) {
		this.setUserID(id);
		this.setUserName(userName);
		this.setUserPassword(userPassword);
		this.setType(type);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserID() {
		return userID;
	}

	private void setUserID(String userID) {
		this.userID = userID;
	}

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
	

}
