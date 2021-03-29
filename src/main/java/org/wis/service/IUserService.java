package org.wis.service;

import org.wis.entity.User;

public interface IUserService {
	public int addUser(User auser) ;
	public int loginCheckUser(User auser);
}
