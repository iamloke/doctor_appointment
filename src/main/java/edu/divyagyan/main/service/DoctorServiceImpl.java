package edu.divyagyan.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.divyagyan.main.entity.Department;
import edu.divyagyan.main.entity.Doctor;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(new Doctor(1, "Sam", new Department(1, "Cardiology")));
		doctors.add(new Doctor(2, "John", new Department(2, "Neurology")));
		doctors.add(new Doctor(3, "Jake", new Department(1, "Cardiology")));
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
