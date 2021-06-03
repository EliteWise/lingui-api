package fr.elite.lingui.service;

import java.util.List;

import fr.elite.lingui.entity.UserEntity;

public interface UserService {
	
	void addUser(UserEntity user);
	List<UserEntity> getAllUsers();

}
