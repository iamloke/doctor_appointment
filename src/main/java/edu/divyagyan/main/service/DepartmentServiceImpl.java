package edu.divyagyan.main.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.divyagyan.main.entity.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<>();
		departments.add(new Department(1, "Cardiology"));
		departments.add(new Department(2, "Neurology"));
		return departments;
	}

	@Override
	public Department getDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDepartment(Department newDepartment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Department updateDepartment(long id, Department updatedDepartment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDepartment(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
