package edu.divyagyan.main.service;

import java.util.List;

import edu.divyagyan.main.entity.Patient;

public interface PatientService {
	List<Patient> getAllPatients();
	Patient getPatient(long id);
	boolean registerPatient(Patient newPatient);
	Patient updatePatient(long id, Patient updatedPatient);
	boolean removePatient(long id);
}
