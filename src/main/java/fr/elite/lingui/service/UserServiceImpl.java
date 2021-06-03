package fr.elite.lingui.service;

import java.util.List;

import org.apache.catalina.User;

import fr.elite.lingui.entity.UserEntity;
import fr.elite.lingui.repository.UserRepository;

public class UserServiceImpl implements UserService {
	
	UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void addUser(UserEntity user) {
		userRepository.save(user);
		
	}

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}

}
