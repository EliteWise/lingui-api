package fr.lingui.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.lingui.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, Long> {

}
