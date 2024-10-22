package edu.divyagyan.main.service;

import java.util.List;

import edu.divyagyan.main.entity.Doctor;

public interface DoctorService {
	List<Doctor> getAllDoctors();
	Doctor getDoctor(long id);
	boolean registerDoctor(Doctor newDoctor);
	Doctor updateDoctor(long id, Doctor updatedDoctor);
	boolean removeDoctor(long id);
}
