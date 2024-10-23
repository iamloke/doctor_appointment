package edu.divyagyan.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.divyagyan.main.entity.Appointment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class AppointmentController {
	@GetMapping("/appointments")
	public List<Appointment> getAllAppointments() {
		return new ArrayList<Appointment>();
	}
	
}
