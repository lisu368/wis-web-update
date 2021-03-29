package org.wis.service.impl;

import org.wis.dao.IUserDao;
import org.wis.dao.impl.UserDaoImpl;
import org.wis.entity.User;
import org.wis.service.IUserService;

public class UserServiceImpl implements IUserService{
	IUserDao userDao=new UserDaoImpl();
	// execute add query method
	public int addUser(User auser) {
		int isExist=userDao.queryUserByUserName(auser);
		if (isExist>0) {
		//	return information ("already in MySQL");
			return 0; // already in MySQL
		}
		if (isExist<0) {
		//	return information("error in MySQL");
			return -1; //error in MySQL
		}
		if (isExist==0) {
		//	return information("not in MySQL");
			int addresult=userDao.AddUser(auser);
			if (addresult>0) {
			//	return information("add is successful");
				return 2; // add is successful
			} 
			if (addresult<0) {
			//	return information("error in MySQL");
				return -1; // error in MySQL
			}
			if (addresult==0) {
				//return information("add fail");
				return 1; // add fail
			}
		}
		return 1; // add fail
	}
	
	public int loginCheckUser(User auser) {
		int isExist=userDao.queryUserByUserNameAndUserPassword(auser);
		if (isExist>0) {
			//return information("already in MySQL");
			return 1; // login is successful
		}
		if (isExist<0) {
			//return information("error in MySQL");
			return -1; //error in MySQL
		}
		if (isExist==0) {
			//return information("not in MySQL");
			return 0; // login fail;
		
		}
		return 0;// login fail;
		
	}
}
