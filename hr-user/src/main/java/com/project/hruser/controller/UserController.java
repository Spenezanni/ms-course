package com.project.hruser.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.hruser.entities.User;
import com.project.hruser.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "list-all")
	public ResponseEntity<List<User>> findAll() {
		List<User> list = userService.findAll();
		return ResponseEntity.ok(list);
	
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findWorkerById(@PathVariable Long id) {
		User user = userService.findUserById(id);
		return new ResponseEntity<>(user, HttpStatus.OK);
	
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findWorkerByEmail(@RequestParam String email) {
		User user = userService.findUserByEmail(email);
		return new ResponseEntity<>(user, HttpStatus.OK);
	
	}
	
}
