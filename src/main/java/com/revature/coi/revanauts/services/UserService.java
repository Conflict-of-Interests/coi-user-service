package com.revature.coi.revanauts.services;

import java.util.List;

import com.revature.coi.revanauts.models.User;

public interface UserService {
	public List<User> getAll();
	public User getByUsername(User user);
	public User getById(User user);
	public User register(User user);
	public User update(User user);
}
