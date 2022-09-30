package com.project.hruser.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hruser.entities.User;
import com.project.hruser.repository.UserRepository;
import com.project.hruser.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		List<User> list = userRepository.findAll();
		return list;
		
	}

	@Override
	public User findUserById(Long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

	@Override
	public User findUserByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}
}
