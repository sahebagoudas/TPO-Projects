package com.codemind.clgTpo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codemind.clgTpo.model.TpoCoordinators;
import com.codemind.clgTpo.repository.TpoCoordinatorsRepository;

@RestController
public class TpoCoordinatorsController {
	
	@Autowired
	private TpoCoordinatorsRepository tpoCoordinatorsRepository;
	
	@PostMapping("/addCoordinators")
	private String addCoordinators(@RequestBody TpoCoordinators tpoCoordinators) {
		
		tpoCoordinatorsRepository.save(tpoCoordinators);
		
		return tpoCoordinators.getEmail();
	}
}
