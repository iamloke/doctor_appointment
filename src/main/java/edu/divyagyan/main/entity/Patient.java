package edu.divyagyan.main.entity;

public class Patient {
	private long id;
	private String name;
	
	public Patient() {}
	
	public Patient(long id, String name) {
		this.id = id;
		this.name = name;
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
	
	@Override
	public String toString() {
		return "Patient{id=" + id + ", name=" + name + "}";
	}
}
