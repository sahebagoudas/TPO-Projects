package com.codemind.clgTpo.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.clgTpo.student.model.Student;
import com.codemind.clgTpo.student.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/registration")
	private String registration(@RequestBody Student student) {
		
		studentService.save(student);
		
		return student.getEmail();
	}
	
	@GetMapping("/getStudent")
	private Student getStudentByEmail(String email) {
		
		return studentService.findByEmail(email);
	}
	
	private Boolean isExist(String email) {
		
		return studentService.existsByEmail(email);
	}
}
