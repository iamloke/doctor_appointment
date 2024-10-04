package edu.divyagyan.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.divyagyan.main.model.Doctor;
import edu.divyagyan.main.repo.DoctorRepo;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepo repo;
	
	public List<Doctor> getAllDoctors() {
		return repo.findAll();
	}
}
