package edu.divyagyan.main.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.divyagyan.main.entity.Department;
import edu.divyagyan.main.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	private final DepartmentService deptService;
	
	public DepartmentController(DepartmentService deptService) {
		this.deptService = deptService;
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments() {
		return deptService.getAllDepartments();
	}
	
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable long id) {
		return deptService.getDepartment(id);
	}
	
	@PutMapping("/department/{id")
	public Department updateDepartment(@PathVariable long id, @RequestBody Department updatedDepartment) {
		return deptService.updateDepartment(id, updatedDepartment);
	}
	
	@DeleteMapping("/department/{id}")
	public boolean deleteDepartment(@PathVariable long id) {
		return deptService.deleteDepartment(id);
	}
}
