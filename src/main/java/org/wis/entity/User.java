package org.wis.entity;

public class User {
	private String UserName;
	private String UserPassword;
	
	
	public User() {

	}
	
	public User(String userName, String userPassword) {
		super();
		UserName = userName;
		UserPassword = userPassword;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
}
