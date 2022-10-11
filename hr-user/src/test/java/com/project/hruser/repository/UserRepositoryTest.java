package com.project.hruser.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import com.project.hruser.entities.User;

@SpringBootTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryTest {

	@Autowired(required=true)
	private UserRepository userRepository;

	@Test
	void givenValidEmailWhenFindByEmailThenReturnEmail() {
		
		String email = "leia@gmail.com";
		User user = userRepository.findByEmail(email);
		Assertions.assertEquals(email, user.getEmail());

	}
	
	@Test
	void givenInvalidEmailWhenFindByEmailThenReturnException() {
		
		String email = "fj@gmail.com";
		User user = userRepository.findByEmail(email);
		Assertions.assertNull(user);

	}
}
