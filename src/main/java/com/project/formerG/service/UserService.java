package com.project.formerG.service;

import org.springframework.stereotype.Service;

import com.project.formerG.entityClass.User;
import com.project.formerG.userDTO.UserDTO;
import com.project.formerG.userRepository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void signUpUser(UserDTO userDTO) {
		// Convert UserDTO to User entity and save to database
		User user = new User();
		user.setName(userDTO.getName());
		user.setLocation(userDTO.getLocation());
		user.setPincode(userDTO.getPincode());
		user.setMobileNo(userDTO.getMobileNo());
		// Save user to database
		userRepository.save(user);
	}
}
