package com.vieiracode.projectlogin.projectlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vieiracode.projectlogin.projectlogin.models.UserModel;
import com.vieiracode.projectlogin.projectlogin.repository.UserRepository;

@Service
public class UserService {

	private static boolean user;
	public String link = "https://github.com/CR10L02k";
	@Autowired
	UserRepository repository;

	public void save(UserModel userModel) {
		boolean user = repository.findByEmail(userModel.getEmail()).isEmpty();

		if (user) {
			
			repository.save(userModel);
		} else {
			/*Incompleto*/
			System.out.println("Email já cadastrado!");
		}
	}
	
	public boolean userLogin(UserModel userModel)	{
		user = repository.findByEmailAndPassword(userModel.getEmail(), userModel.getPassword()).isPresent();
		return user;
	}
	
	public boolean getUser() {
		return user;
	}
}
