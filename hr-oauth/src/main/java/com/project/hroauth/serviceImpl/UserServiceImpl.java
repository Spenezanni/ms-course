package com.project.hroauth.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hroauth.entities.User;
import com.project.hroauth.feignClient.UserFeignClient;
import com.project.hroauth.sevice.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserFeignClient userFeignClient;

	@Override
	public User findByEmail(String email) {
		User user = userFeignClient.findWorkerByEmail(email).getBody();
		if (user == null) {
			logger.error("Email not found " + email);
			throw new IllegalArgumentException("Email not found ");
		}
		logger.info("Email found " + email);
		return user;
	}

}
