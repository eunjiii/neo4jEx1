package org.honeyrock.service;

import java.util.Collection;

import org.honeyrock.aa.User;
import org.honeyrock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public Collection<User> getAll() {
		
		return userRepository.getAllUsers();
	}



}
