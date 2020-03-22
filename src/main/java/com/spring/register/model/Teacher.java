package com.spring.register.model;

public class Teacher {
	private int teacherId;
	private String name;
	private String email;

	public Teacher() {

	}

	public Teacher(int teacherId, String name, String email) {
		this.teacherId = teacherId;
		this.name = name;
		this.email = email;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public int getTeacherId() {
		return this.teacherId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return this.getName() + " " + this.getEmail() + " " + this.getTeacherId();
	}
}