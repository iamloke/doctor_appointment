package edu.divyagyan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.divyagyan.main.model.Doctor;
import edu.divyagyan.main.service.DoctorService;

@RestController
public class HomeController {
	
	@Autowired
	private DoctorService service;
	
	@GetMapping("/")
	public List<Doctor> home() {
		return service.getAllDoctors();
	}
	
}
