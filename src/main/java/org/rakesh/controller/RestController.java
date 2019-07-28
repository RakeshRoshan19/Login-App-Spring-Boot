package org.rakesh.controller;


import java.util.List;
import java.util.Optional;

import org.rakesh.entity.User;
import org.rakesh.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String hello() {
		return "This is home Page";
	}

	@PostMapping("/add")
	public void saveUser(User user) {
		userService.saveUser(user);
	}

	@GetMapping("/show")
	public List<User> showUser() {
		
		return userService.showUser();
		
	}
	
	@DeleteMapping("/delete")
	public void deleteUser(int id) {
		userService.deleteUser(id);			
	}
	
	@PutMapping("/edit")
	public User editUser(int id) {
		return userService.editUser(id);			
	}
}
