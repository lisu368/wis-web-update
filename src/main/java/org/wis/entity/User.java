package org.wis.entity;

//Author: Liang Sun
//Date: March 31, 2021
//Purpose: WIS User Class
//Project: Welcome Institute of Studies (WIS) Web App Project

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
