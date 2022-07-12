package com.codemind.clgTpo.service;

import java.util.List;

import com.codemind.clgTpo.student.model.Student;

public interface StudentFetchService {
	
	List<Student> fetchAllStudentList();
	List<Student> findByDegreeDiplomaAndYear(String degreeDiploma, Integer year);
	List<Student> findByDegreeDiploma(String degreeDiploma);
	List<Student> findByYear(Integer year);

}
