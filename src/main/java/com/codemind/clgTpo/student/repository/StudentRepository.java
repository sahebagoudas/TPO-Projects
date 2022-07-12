package com.codemind.clgTpo.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codemind.clgTpo.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
		
	Student findByEmail(String email);
	Boolean existsByEmail(String email);
	
}
