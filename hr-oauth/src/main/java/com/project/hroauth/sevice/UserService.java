package com.project.hroauth.sevice;

import com.project.hroauth.entities.User;

public interface UserService {
	
	User findByEmail(String email);

}
