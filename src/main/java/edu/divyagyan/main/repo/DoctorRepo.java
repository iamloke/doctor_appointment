package edu.divyagyan.main.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.divyagyan.main.model.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Long>{

}
