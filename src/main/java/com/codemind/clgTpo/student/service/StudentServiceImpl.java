package com.codemind.clgTpo.student.service;

import com.codemind.clgTpo.student.model.Student;
import com.codemind.clgTpo.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	
    @Autowired
    private StudentRepository studentRepository;
    
    //@Autowired
    ///private RoleRepository roleRepository;
    
    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(Student student) {
		//student.setPassword(bCryptPasswordEncoder.encode(student.getPassword()));
		//TO DO We can role mapping here
		studentRepository.save(student);
		
	}


	@Override
	public Student findByEmail(String email) {
		
		return studentRepository.findByEmail(email);
	}

	@Override
	public Boolean existsByEmail(String email) {

		return studentRepository.existsByEmail(email);
	}
}
