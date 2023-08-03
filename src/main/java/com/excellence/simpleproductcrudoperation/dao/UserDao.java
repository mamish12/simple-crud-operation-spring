package com.excellence.simpleproductcrudoperation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.excellence.simpleproductcrudoperation.dto.User;
import com.excellence.simpleproductcrudoperation.repository.ProductRepository;
import com.excellence.simpleproductcrudoperation.repository.UserRepository;


@Repository
public class UserDao {
	
	
	@Autowired
	UserRepository repository;
	
	/*
	 * saveuser
	 */
	
	public User insertUser(User user)
	{
		return repository.save(user);
	}
	
	public User loginUser(String userName)
	{
		return repository.getByUserName(userName);
	}
	
	

}
