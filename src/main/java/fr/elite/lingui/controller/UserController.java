package fr.elite.lingui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.elite.lingui.model.User;

@RestController
public class UserController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	

}
