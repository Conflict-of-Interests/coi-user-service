package com.revature.coi.revanauts.controllers;

import java.util.List;

import com.revature.coi.revanauts.models.User;

public interface UserController {
	public List<User> getAllUsers();
	public User getUserByUsername(String username);
	public User getUserById(long id);
	public User registerUser(User user);
	public User updateUser(User user);
}
