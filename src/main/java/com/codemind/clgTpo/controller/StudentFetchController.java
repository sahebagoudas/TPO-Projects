package com.codemind.clgTpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.clgTpo.service.StudentFetchService;
import com.codemind.clgTpo.student.model.Student;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/tpo")
public class StudentFetchController {

	@Autowired
	private StudentFetchService studentFetchService;
	
	@GetMapping("/students-list")
	public List<Student> getAllStudents(){
		System.out.println("Returning Student List");
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
	
	@DeleteMapping("delete-student/{student_id}")
	public boolean deleteStudent(@PathVariable("student_id") long student_id, Student student) {
		student.setId(student_id);
		return studentFetchService.deleteStudent(student);
	}
	
	@GetMapping("student/{student_id}")
	public List<Student> getAllStudentByID(@PathVariable("student_id") long student_id, Student student) {
		student.setId(student_id);
		return studentFetchService.getStudentById(student);
	}
}
