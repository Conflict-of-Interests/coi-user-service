package com.revature.coi.revanauts.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.coi.revanauts.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
