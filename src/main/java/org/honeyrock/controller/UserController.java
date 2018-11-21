 package org.honeyrock.controller;

import java.util.Collection;

import org.honeyrock.domain.User;
import org.honeyrock.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/neo4j")
public class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping
	public Collection<User> getAll(){
		return userService.getAll();
	}
	
}
