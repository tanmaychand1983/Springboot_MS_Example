package com.microservice.springboot.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservice.springboot.userservice.VO.Department;
import com.microservice.springboot.userservice.VO.ResponseTemplate;
import com.microservice.springboot.userservice.entity.User;
import com.microservice.springboot.userservice.repository.UserRepository;

@Service
public class UserServices {

	@Autowired
	public UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		 return userRepository.save(user);
	}

	/*
	 * public User getUserById(Long userId) { return
	 * userRepository.getUserById(userId); }
	 */

	public ResponseTemplate getUserWithDepartment(Long userId) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://localhost:8001/departments/"+user.getDepartmentId(),
				                                       Department.class);
		
		responseTemplate.setUser(user);
		responseTemplate.setDepartment(department);
		return responseTemplate;
	}
	
	
}
