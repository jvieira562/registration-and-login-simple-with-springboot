package com.vieiracode.projectlogin.projectlogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vieiracode.projectlogin.projectlogin.models.UserModel;
import com.vieiracode.projectlogin.projectlogin.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/home")
	public String home() {
		return "nodeProp";
	}

	@RequestMapping("/create-account")
	public String createAccount() {
		return "create-account";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String userSalve(UserModel userModel) {
		userService.save(userModel);
		return "redirect:/login";
	}

	@PostMapping(value = "/login")
	public String login(UserModel userModel) {
		userService.userLogin(userModel);

		if (userService.getUser()) {

			System.out.println("Entrei no if!");
			return "redirect:/home";
		} else {

			System.out.println("Entrei no else");
			return "redirect:/login";
		}

	}

}
