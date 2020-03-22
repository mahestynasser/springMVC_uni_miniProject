package com.spring.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.register.dao.StudentCourseDAO;
import com.spring.register.model.StudentCourse;

@Service
public class StudentCourseService {

	@Autowired
	StudentCourseDAO studentCourseDao;

	public void addStudentCourse(StudentCourse studentCourse) {
		studentCourseDao.addStudentCourse(studentCourse);
	}

	public List<StudentCourse> getStudentCourses() {
		List<StudentCourse> list = studentCourseDao.getStudentCourses();
		return list;
	}

	public void deleteStudentCourse(int studentId, int courseId) {
		studentCourseDao.deleteStudentCourse(studentId, courseId);
	}
}
