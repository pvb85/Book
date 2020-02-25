package com.hcl.synchrony.onlinebookshopping.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.synchrony.onlinebookshopping.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer>{
	
    public User findByUserNameAndUserPasword(String userName, String password ); 

}
