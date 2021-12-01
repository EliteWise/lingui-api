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
import fr.lingui.service.SequenceGeneratorService;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	private SequenceGeneratorService sequenceGenerator;
	
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@PostMapping("/register")
	public ResponseEntity<UserEntity> registerUser(UserEntity user) {
		System.out.println(user.getName());
		user.setId(sequenceGenerator.generateSequence(UserEntity.SEQUENCE_NAME));
		repository.save(user);
		return new ResponseEntity<UserEntity>(user, new HttpHeaders(), HttpStatus.OK);
	}

}
