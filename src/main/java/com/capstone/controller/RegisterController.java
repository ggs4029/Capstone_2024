package com.capstone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

	@GetMapping("/register/register")
	public String register() {
		return "register/register";
	}


	@GetMapping("/register")
	public String newRegister() {
		return "home";
	}
}
