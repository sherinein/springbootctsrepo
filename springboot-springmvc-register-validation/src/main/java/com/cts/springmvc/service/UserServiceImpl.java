package com.cts.springmvc.service;

import com.cts.springmvc.model.User;

public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		System.out.println("User added successfully");
		
	}

}
