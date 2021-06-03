package fr.elite.lingui.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.elite.lingui.entity.UserEntity;
import fr.elite.lingui.service.UserService;

@RestController
public class UserController {
	
	UserService userService;
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/registerUser")
	public void registerUser(UserEntity user) {
		userService.addUser(user);
	}

}
