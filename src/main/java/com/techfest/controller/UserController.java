package com.techfest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techfest.interfaces.UserInterface;
import com.techfest.model.User;

@RestController
public class UserController {

	@Autowired
	private UserInterface userInterface;

	@GetMapping("/user/email/{email}")
	public User findByEmail(@Valid @PathVariable String email) {
		User user = userInterface.findByEmail(email);
		return user;
	}

	@GetMapping("/user/userName/{userName}")
	public User findByUserName(@Valid @PathVariable String userName) {
		User user = userInterface.findByUserName(userName);
		return user;
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		List<User> usersList = userInterface.findAll();
		return usersList;
	}

	@PostMapping(name="/saveUser", consumes="application/json")
	public User saveNewUser(@RequestBody User user) {
		user.toString();
		User savedUser = userInterface.saveNewUser(user);
		return savedUser;
	}
}
