package com.codemind.clgTpo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemind.clgTpo.student.model.Student;

@Repository
public interface StudentFetchRepository extends JpaRepository<Student, Long>{
		
	List<Student> findByDegreeDiplomaAndYear(String degreeDiploma, Integer year);
	List<Student> findByDegreeDiploma(String degreeDiploma);
	List<Student> findByYear(Integer year);
	void deleteById(Long id);
	List<Student> getStudentById(Long id);
	
}
