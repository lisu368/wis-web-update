package org.wis.dao;

import org.wis.entity.User;

//Author: Liang Sun
//Date: March 31, 2021
//Purpose: WIS Interface Class
//Project: Welcome Institute of Studies (WIS) Web App Project

public interface IUserDao {

	
	
	public int queryUserByUserName(User auser);  
		
	public int queryUserByUserNameAndUserPassword(User auser);
	
	
	public int AddUser(User auser);  

}
