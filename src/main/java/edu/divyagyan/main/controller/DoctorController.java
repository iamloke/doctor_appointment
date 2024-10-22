package edu.divyagyan.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.divyagyan.main.entity.Doctor;
import edu.divyagyan.main.service.DoctorServiceImpl;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@GetMapping
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
}
