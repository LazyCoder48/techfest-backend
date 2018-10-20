package com.techfest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techfest.interfaces.UserInterface;
import com.techfest.model.User;
import com.techfest.repository.UserRepository;

@Service
public class UserService implements UserInterface {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> findAll() {
		List<User> usersList = userRepo.findAll();
		return usersList;
	}

	@Override
	public User findByEmail(String email) {
		User user = userRepo.findByEmail(email);
		return user;
	}

	@Override
	public User findByUserName(String userName) {
		User user = userRepo.findByUserName(userName);
		return user;
	}

	@Override
	public User saveUser(User user) {
		User savedUser = userRepo.save(user);
		return savedUser;
	}

	@Override
	public User updateUser(User user) {
		User updatedUser = userRepo.save(user);
		return updatedUser;
	}

}
