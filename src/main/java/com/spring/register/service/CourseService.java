package com.spring.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.register.dao.CourseDAO;
import com.spring.register.model.Course;



@Service
public class CourseService {

	@Autowired
	CourseDAO courseDao;

	public void addCourse(Course course) {
		courseDao.addCourse(course);
	}

	public List<Course> getCourses() {
		List<Course> list = courseDao.getCourses();
		return list;
	}

	public Course getCourseById(int id) {
		Course course = courseDao.getCourseById(id);
		return course;
	}

	public void updateCourse(Course course) {
		courseDao.updateCourse(course);
	}

	public void deleteCourse(int id) {
		courseDao.deleteCourse(id);
	}
}

