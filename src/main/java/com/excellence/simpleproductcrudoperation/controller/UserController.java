package com.excellence.simpleproductcrudoperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excellence.simpleproductcrudoperation.dto.User;
import com.excellence.simpleproductcrudoperation.service.UserService;

@RestController
public class UserController {

	
	@Autowired
	UserService service;
	
	
	@PostMapping(value="/saveUser")
	public User insertUser(@RequestBody User user)
	{
		return service.insertUser(user);
	}
	
	@GetMapping(value="/loginUser/{userName}/{userPass}")
	public User loginUser(@PathVariable String userName,@PathVariable String userPass)
	{
		return service.loginUser(userName, userPass);
	}
}
