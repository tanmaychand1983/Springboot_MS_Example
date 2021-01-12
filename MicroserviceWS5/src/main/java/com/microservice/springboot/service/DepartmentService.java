package com.microservice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.springboot.entity.Department;
import com.microservice.springboot.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		 System.out.println(" Service saveDepartment ");
		return departmentRepository.save(department);
	}

	public Department findDepartment(Long departmentId) {
		 
		return departmentRepository.findByDepartmentId(departmentId);
	}

	 
	
}
