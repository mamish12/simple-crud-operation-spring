package com.excellence.simpleproductcrudoperation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excellence.simpleproductcrudoperation.dao.UserDao;
import com.excellence.simpleproductcrudoperation.dto.User;

@Service
public class UserService {
	
	
	@Autowired
	UserDao dao;
	
	
	public User insertUser(User user)
	{
		return dao.insertUser(user);
	}
	
	/*
	 * userLogin
	 */
	
	public User loginUser(String userName,String userPass)
	{
		User user=dao.loginUser(userName);
		if(user!=null)
		{
			if(user.getUserName().equals(userName) && (user.getUserPass().equals(userPass)))
			{
				System.out.println("User Login successfully");
			}
			else
			{
				System.out.println("User failed to login");
			}
		}
		else
		{
			return null;
		}
		return user;
	}

}
