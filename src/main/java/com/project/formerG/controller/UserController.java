package com.project.formerG.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.formerG.service.UserService;
import com.project.formerG.userDTO.UserDTO;

@RestController
@RequestMapping("api/users")
public class UserController {

	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping("/signup")
	public ResponseEntity<String> signUpUser(@RequestBody UserDTO userDTO) {
		userService.signUpUser(userDTO);
		return ResponseEntity.ok("User signed up successfully!");
	}
}
