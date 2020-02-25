package com.hcl.synchrony.onlinebookshopping.service;

import com.hcl.synchrony.onlinebookshopping.entity.User;

public interface UserService {
	
	public User login(String userName,String password);
	public String registerUser(User user);
	

}
