package edu.divyagyan.main.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Appointment {
	private long id;
//	private static int DURATION;
	private LocalDateTime dateTime;
	private Patient patient;
	
	public Appointment() {}
	
	public Appointment(long id, LocalDateTime dateTime, Patient patient) {
		this.id = id;
		this.dateTime = dateTime;
		this.patient = patient;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return "Appointment{id=" + id + ", patient=" + patient.getName() + " ,time " + dateTime.format(formatter) + "}";
	}
}
