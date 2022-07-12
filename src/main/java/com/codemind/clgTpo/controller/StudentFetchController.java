package com.codemind.clgTpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.clgTpo.service.StudentFetchService;
import com.codemind.clgTpo.student.model.Student;

@RestController
public class StudentFetchController {

	@Autowired
	private StudentFetchService studentFetchService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentFetchService.fetchAllStudentList();
	}
	
	@GetMapping("/students/degreeOrDiploma")
	public List<Student> getStudentsByDegreeDiploma(@RequestParam String degreeDiploma){
		
		return studentFetchService.findByDegreeDiploma(degreeDiploma);
	}
	
	@GetMapping("/students/year")
	public List<Student> getStudentsByDegreeDiplomaAndYear(@RequestParam String degreeDiploma, @RequestParam Integer year){
		
		return studentFetchService.findByDegreeDiplomaAndYear(degreeDiploma, year);
	}
}
