package com.project.hruser.classesMock;

import java.util.ArrayList;
import java.util.List;
import com.project.hruser.entities.User;

public class UsersMock {

	public static List<User> getListUsers() {
		User user1 = getUser1();
		User user2 = getUser2();
		List<User> listUsers = new ArrayList<>();
		listUsers.add(user1);
		listUsers.add(user2);
		return listUsers;
	}

	public static User getUser1() {
		User user = new User();
		user.setId(1l);
		user.setEmail("email.user1@email.com");
		user.setName("Roberto");
		user.setPassword("password");
		return user;
	}

	public static User getUser2() {
		User user2 = new User();
		user2.setId(1l);
		user2.setEmail("email.user2@email.com");
		user2.setName("Roberta");
		user2.setPassword("password");
		return user2;
	}

}
