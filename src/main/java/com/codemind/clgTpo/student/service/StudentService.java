package com.codemind.clgTpo.student.service;

import com.codemind.clgTpo.student.model.Student;

public interface StudentService {
    
	void save(Student student);
    Student findByEmail(String email);
    Boolean existsByEmail(String email);
}
