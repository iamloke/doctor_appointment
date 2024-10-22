package edu.divyagyan.main.service;

import java.util.List;

import edu.divyagyan.main.entity.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	Department getDepartment(long id);
	boolean addDepartment(Department newDepartment);
	Department updateDepartment(long id, Department updatedDepartment);
	boolean deleteDepartment(long id);
}
