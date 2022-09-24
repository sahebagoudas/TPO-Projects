package com.codemind.clgTpo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codemind.clgTpo.repository.StudentFetchRepository;
import com.codemind.clgTpo.student.model.Student;

@Service
public class StudentFetchServiceImpl implements StudentFetchService{
	
	@Autowired
	private StudentFetchRepository studentFetchRepository;
	
	@Override
	public List<Student> fetchAllStudentList() {
		
		return studentFetchRepository.findAll();
	}

	@Override
	public List<Student> findByDegreeDiplomaAndYear(String degreeDiploma, Integer year) {
		
		return studentFetchRepository.findByDegreeDiplomaAndYear(degreeDiploma, year);
	}

	@Override
	public List<Student> findByDegreeDiploma(String degreeDiploma) {
		
		return studentFetchRepository.findByDegreeDiploma(degreeDiploma);
	}

	@Override
	public List<Student> findByYear(Integer year) {
		
		return studentFetchRepository.findByYear(year);
	}

	public boolean deleteStudent(Student student) {
		
		boolean status=false;
		
		try {
			studentFetchRepository.deleteById(student.getId());
			status = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	
	public List<Student> getStudentById(Student student){
		return studentFetchRepository.getStudentById(student.getId());
	}

}
