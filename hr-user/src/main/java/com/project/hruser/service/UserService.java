package com.project.hruser.service;

import java.util.List;

import com.project.hruser.entities.User;

public interface UserService {

	List<User> findAll();

	User findUserById(Long id);

	User findUserByEmail(String email);

}
