package com.note.editor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.note.editor.model.User;
import com.note.editor.service.UserService;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) {
				return ResponseEntity.status(200).body(userService.loginUser(user.getUserEmail(), user.getUserPassword()));
	}
	
	public ResponseEntity<?> register() {
		return null;
	}
}
