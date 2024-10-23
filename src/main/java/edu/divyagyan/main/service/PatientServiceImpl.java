package edu.divyagyan.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.divyagyan.main.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService {

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> patients = new ArrayList<>();
		patients.add(new Patient(1, "Luke"));
		patients.add(new Patient(2, "Ashley"));
		patients.add(new Patient(3, "Jaden"));
		patients.add(new Patient(4, "Will"));
		patients.add(new Patient(5, "Tusk"));
		return patients;
	}

	@Override
	public Patient getPatient(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerPatient(Patient newPatient) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Patient updatePatient(long id, Patient updatedPatient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removePatient(long id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
