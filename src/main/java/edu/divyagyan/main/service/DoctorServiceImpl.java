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
		
		return doctors;
	}

	@Override
	public Doctor getDoctor(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerDoctor(Doctor newDoctor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Doctor updateDoctor(long id, Doctor updatedDoctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeDoctor(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
