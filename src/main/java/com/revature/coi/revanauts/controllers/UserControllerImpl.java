package com.revature.coi.revanauts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.coi.revanauts.models.User;
import com.revature.coi.revanauts.services.UserService;

@RestController("userController")
@CrossOrigin("*")
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAll();
	}

	@GetMapping("/{username}")
	public User getUserByUsername(@RequestBody User user) {
		return userService.getByUsername(user);
	}

	@GetMapping("/{id}")
	public User getUserById(User user) {
		return userService.getByUsername(user);
	}

	@PostMapping
	public User registerUser(User user) {
		return userService.register(user);
	}

	@PutMapping
	public User updateUser(User user) {
		return userService.update(user);
	}

}
