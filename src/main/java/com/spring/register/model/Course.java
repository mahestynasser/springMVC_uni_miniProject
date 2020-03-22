package com.spring.register.model;

public class Course {

	private int courseId;
	private String name;
	private String description;
	private int teacherId;

	public Course() {

	}

	public Course(int courseId, String name, String description, int teacherId) {
		this.courseId = courseId;
		this.name = name;
		this.description = description;
		this.teacherId = teacherId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getCourseId() {
		return this.courseId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String toString() {
		return this.getName() + " " + this.getDescription() + " " + this.getTeacherId() + " " + this.getCourseId();
	}

}
