package com.microservice.springboot.userservice.VO;

import com.microservice.springboot.userservice.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

	private User user;
	private Department department;
}
