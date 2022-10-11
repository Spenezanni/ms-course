package com.project.hruser.controller;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import com.project.hruser.classesMock.UsersMock;
import com.project.hruser.entities.User;
import com.project.hruser.service.UserService;


@AutoConfigureMockMvc
@SpringBootTest
class UserControllerTest {
	
	private static final String USERS = "/users/list-all";
	
	@Autowired
	private MockMvc mvc;
	
	@MockBean
	private UserService userService;

	@Test
	void givenValidRequestWhenFindAllThenReturnAllUsers() throws Exception {
		
		List<User> listUsers = UsersMock.getListUsers();
		
		when(userService.findAll()).thenReturn(listUsers);
		
		mvc.perform(get(USERS)).andExpect(status().isOk());
		
		verify(userService).findAll();
		
	}

}
