package org.wis.dao.impl;

import java.sql.*;

import org.wis.dao.IUserDao;
import org.wis.entity.User;
import org.wis.util.DBUtil;

public class UserDaoImpl implements IUserDao{
	//common information to connect mysql
	private final String URL = "jdbc:mysql://127.0.0.1:3306/Assignment1";
	private final String MySQLUserName = "root";
	private final String MySQLUserPassword = "lisu368";
	// execute search query method
	public int queryUserByUserName(User auser)  {
		String sql="select * from wis.loginfo where Username=?";
		Object[] params= {auser.getUserName()};
		return DBUtil.executeRead(sql, params);		
		
	}
	
	// execute search query method
	public int queryUserByUserNameAndUserPassword(User auser)  {
			String sql="select * from wis.loginfo where Username=? and UserPassword=?";
			Object[] params= {auser.getUserName(),auser.getUserPassword()};
			return DBUtil.executeRead(sql, params);	
	}
	// execute add query method
	public int AddUser(User auser)  {
		
		String sql="insert into wis.loginfo(UserName,UserPassword) values (?,?);";
		Object[] params= {auser.getUserName(),auser.getUserPassword()};
		return DBUtil.execteUpdate(sql, params);	

		
		
	}



}
