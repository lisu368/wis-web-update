package org.wis.dao;

import org.wis.entity.User;

public interface IUserDao {

	
	
	public int queryUserByUserName(User auser);  
		
	public int queryUserByUserNameAndUserPassword(User auser);
	
	
	public int AddUser(User auser);  

}
