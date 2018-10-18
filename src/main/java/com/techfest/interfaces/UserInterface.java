package com.techfest.interfaces;

import java.util.List;

import com.techfest.model.User;

public interface UserInterface {

	public List<User> findAll();
	
	public User findByEmail(String email);
	
	public User findByUserName(String userName);

	public User saveNewUser(User user);
}
