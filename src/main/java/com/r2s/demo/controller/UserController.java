package com.r2s.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.demo.entity.User;

import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping (path = "user")
public class UserController {

	static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1,"Nguyen Van A", 10));
		users.add(new User(2,"Nguyen Van B", 20));
		users.add(new User(3,"Nguyen Van C", 30));
	}
	
	@GetMapping (path = "")
	//@RequestMapping(method = RequestMethod.GET, path = "")
	public List<User> getAllUsers(){
		return users;
	}
	
	@GetMapping(path = "/{id}")
	public User getUserIdById(@PathVariable(name = "id",required = false) long id) {
		User foundUser = null;
		
		for (User user : users) {
			if (user.getId() == id) {
				foundUser = user;
			}
		}
		return foundUser;
	}
}
