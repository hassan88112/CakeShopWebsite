package com.global.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.global.Repository.RoleRepository;
import com.global.Repository.UserRepository;

@Controller
public class LoginController  {

	
	@Autowired 
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
	
	
	
	
	
	
}
