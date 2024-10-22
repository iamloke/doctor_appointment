package edu.divyagyan.main.entity;

public class Doctor {
	private long id;
	private String name;
	private Department department;
	
	public Doctor() {}
	
	public Doctor(long id, String name, Department department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
        return "Doctor{id=" + id + ", name='" + name + "', department='" + department.getName() + "'}";
	}
}
