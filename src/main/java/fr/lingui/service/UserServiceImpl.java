package fr.lingui.service;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.lingui.entity.UserEntity;
import fr.lingui.repository.UserRepository;

/*public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public UserServiceImpl() {
		
	}
	
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

}*/
