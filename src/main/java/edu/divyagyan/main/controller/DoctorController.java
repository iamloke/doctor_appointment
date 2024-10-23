package edu.divyagyan.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.divyagyan.main.entity.Doctor;
import edu.divyagyan.main.service.DoctorService;

@RestController
@RequestMapping("/api")
public class DoctorController {
	
	private final DoctorService doctorService;
	
	public DoctorController(DoctorService doctorService) {
		this.doctorService = doctorService;
	}
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors() {
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/doctor/{id}")
	public Doctor getDoctor(@PathVariable long id) {
		return doctorService.getDoctor(id);
	}
	
	@PostMapping("/doctor")
	public boolean registerDoctor(@RequestBody Doctor newDoctor) {
		return doctorService.registerDoctor(newDoctor);
	}
	
	@PutMapping("/doctor/{id}")
	public Doctor updateDoctor(@PathVariable long id, @RequestBody Doctor updatedDoctor) {
		return doctorService.updateDoctor(id, updatedDoctor);
	}
	
	@DeleteMapping("/doctor/{id}")
	public boolean removeDoctor(@PathVariable long id) {
		return doctorService.removeDoctor(id);
	}
}
