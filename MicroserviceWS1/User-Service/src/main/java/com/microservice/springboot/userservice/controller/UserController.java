package com.microservice.springboot.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.springboot.userservice.VO.ResponseTemplate;
import com.microservice.springboot.userservice.entity.User;
import com.microservice.springboot.userservice.service.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userServices;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		return userServices.saveUser(user);
	}
	
	/*@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") Long userId) {
		return userServices.getUserById(userId);
	}
	*/
	@GetMapping("/{id}")
	public ResponseTemplate getUserWithDepartment(@PathVariable("id") Long userId) {
		return userServices.getUserWithDepartment(userId);
	}
}
