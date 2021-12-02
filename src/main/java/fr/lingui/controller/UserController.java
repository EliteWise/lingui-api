package fr.lingui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.lingui.entity.UserEntity;
import fr.lingui.repository.UserRepository;
import fr.lingui.util.IdGenerator;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserEntity> registerUser(UserEntity user) {
		System.out.println(user.getName());
		user.setId(new IdGenerator().create());
		repository.save(user);
		return new ResponseEntity<UserEntity>(user, new HttpHeaders(), HttpStatus.OK);
	}

}
