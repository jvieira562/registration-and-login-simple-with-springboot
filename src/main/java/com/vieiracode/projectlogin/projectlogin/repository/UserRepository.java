package com.vieiracode.projectlogin.projectlogin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.vieiracode.projectlogin.projectlogin.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {

//	public UserModel findByEmailAndSenha(String email, String password);
	
		Optional<UserModel> findByEmailAndPassword(String email, String pasword);
		Optional<UserModel> findByEmail(String email);

}
