package com.spring.register.model;

public class Student {

	private int studentId;
	private String name;
	private String email;

	public Student() {
	}

	public Student(int studentId, String name, String email) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return this.studentId;
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
		return this.getName() + " " + this.getEmail() + " " + this.getStudentId();
	}
}