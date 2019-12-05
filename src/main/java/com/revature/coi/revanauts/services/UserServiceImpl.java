package com.revature.coi.revanauts.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.revature.coi.revanauts.exceptions.BadRequestException;
import com.revature.coi.revanauts.exceptions.ResourceCreationException;
import com.revature.coi.revanauts.exceptions.ResourceNotFoundException;
import com.revature.coi.revanauts.models.User;
import com.revature.coi.revanauts.repos.UserRepository;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> getAll() {
		return userRepository.findAll();
	}

	@Override
	public User getByUsername(User user) {
		List<User> foundUsers = userRepository.findByUsername(user.getUsername());
		
		if(foundUsers.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found by username: " + user.getUsername());
		}
		
		return foundUsers.get(0);
	}

	@Override
	public User getById(User user) {
		Optional<User> _user = userRepository.findById(user.getId());
		
		if(_user.isPresent()) {
			return _user.get();
		}
		
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found by id: " + user.getId());
	}

	@Override
	public User register(User user) {
		userRepository.save(user);
		
		if(user.getId() > 0) {
			return user;
		}
		
		throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Could not save User");
	}

	@Override
	public User update(User user) {
		if(user.getId() == 0) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cannot update user with ID 0");
		}
		
		userRepository.save(user);
		
		return user;
	}
}
