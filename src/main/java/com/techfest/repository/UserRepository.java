package com.techfest.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techfest.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findAll();
	
	public User findByEmail(String email);
	
	public User findByUserName(String userName);
	
	public User save(User user);
	
}
