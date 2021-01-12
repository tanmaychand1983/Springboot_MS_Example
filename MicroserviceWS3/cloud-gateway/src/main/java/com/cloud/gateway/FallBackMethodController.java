package com.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallback")
	public String userServiceFallbackMethod() {
		return "User servics is down";
	}
	@GetMapping("/departmentServiceFallback")
	public String departmentServiceFallbackMethod() {
		return "Department servics is down";
	}
}
