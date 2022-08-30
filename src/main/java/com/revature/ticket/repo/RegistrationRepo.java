package com.revature.ticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.ticket.model.User;

public interface RegistrationRepo extends JpaRepository<User, Integer> {

	public User findByEmailId(String emailId);
	
	public User findByEmailIdAndPassword(String emailId, String password);
}
