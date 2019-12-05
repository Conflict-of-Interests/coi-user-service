package com.revature.coi.revanauts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.coi.revanauts.models.User;
import com.revature.coi.revanauts.services.UserService;

@RestController("userController")
@RequestMapping("/users")
@CrossOrigin("*")
public class UserControllerImpl implements UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAll();
	}

	@GetMapping("/username/{username}")
	public User getUserByUsername(@PathVariable("username") String username) {
		return userService.getByUsername(new User(username));
	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") long id) {
		return userService.getById(new User(id));
	}

	@PostMapping
	public User registerUser(@RequestBody User user) {
		return userService.register(user);
	}

	@PutMapping
	public User updateUser(@RequestBody User user) {
		return userService.update(user);
	}

}
