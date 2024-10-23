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

import edu.divyagyan.main.entity.Patient;
import edu.divyagyan.main.service.PatientService;

@RestController
@RequestMapping("/api")
public class PatientController {
	
	private final PatientService patientService;
	
	public PatientController(PatientService patientService) {
		this.patientService = patientService;
	}
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}
	
	@GetMapping("/patient/{id}")
	public Patient getPatient(@PathVariable long id) {
		return patientService.getPatient(id);
	}
	
	@PostMapping("/patient")
	public boolean registerPatient(@RequestBody Patient newPatient) {
		return patientService.registerPatient(newPatient);
	}
	
	@PutMapping("/patient/{id}")
	public Patient updatePatient(@PathVariable long id, @RequestBody Patient updatedPatient) {
		return patientService.updatePatient(id, updatedPatient);
	}
	
	@DeleteMapping("/patient/{id}")
	public boolean removeDoctor(@PathVariable long id) {
		return patientService.removePatient(id);
	}
}
