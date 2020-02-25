package com.hcl.synchrony.onlinebookshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.synchrony.onlinebookshopping.dao.UserDao;
import com.hcl.synchrony.onlinebookshopping.entity.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	public User login(String userName, String password) {
		
		
		User user=userDao.findByUserNameAndUserPasword(userName, password);
		
		return user;
		
		
	}

	public String registerUser(User user) {
		String result=null;
		String nameiffail=user.getUserName();
		try{
			System.out.println(user.getUserId());
			
		userDao.save(user);
		
		String name=user.getUserName();
		result= "Hi " +name+ "  you Successfully registed";
		return result;
		}
		catch (Exception e) {
			System.out.println(e);
			return "Hi " +nameiffail+ "  your registration is failued ";
		}
		
	}
	
	
}
