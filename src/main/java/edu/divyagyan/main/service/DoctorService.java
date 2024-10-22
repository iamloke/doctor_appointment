package edu.divyagyan.main.service;

import java.util.List;

import edu.divyagyan.main.entity.Doctor;

public interface DoctorService {
	public List<Doctor> getAllDoctors();
	public Doctor getDoctor(long id);
	public Doctor registerDoctor(Doctor newDoctor);
	public Doctor updateDoctor(long id);
	public Doctor removeDoctor(long id);
}
