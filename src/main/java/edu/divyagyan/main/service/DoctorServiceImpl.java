package edu.divyagyan.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.divyagyan.main.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor("John Doe", "Cardiology"));
	    doctors.add(new Doctor("Jane Smith", "Neurology"));
		return doctors;
	}

	@Override
	public Doctor getDoctor(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor registerDoctor(Doctor newDoctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor updateDoctor(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor removeDoctor(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
