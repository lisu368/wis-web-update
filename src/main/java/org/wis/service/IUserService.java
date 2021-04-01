package org.wis.service;

import org.wis.entity.User;

//Author: Liang Sun
//Date: March 31, 2021
//Purpose: WIS Interface Class
//Project: Welcome Institute of Studies (WIS) Web App Project

public interface IUserService {
	public int addUser(User auser) ;
	public int loginCheckUser(User auser);
}
