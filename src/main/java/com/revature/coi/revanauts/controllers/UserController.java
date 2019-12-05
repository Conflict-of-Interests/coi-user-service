package com.revature.coi.revanauts.controllers;

import java.util.List;

import com.revature.coi.revanauts.models.User;

public interface UserController {
	public List<User> getAllUsers();
	public User getUserByUsername(User user);
	public User getUserById(User user);
	public User registerUser(User user);
	public User updateUser(User user);
}
