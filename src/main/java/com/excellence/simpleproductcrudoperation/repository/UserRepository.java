package com.excellence.simpleproductcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.simpleproductcrudoperation.dto.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User getByUserName(String userName);

}
