package com.spring.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.register.dao.StudentDAO;
import com.spring.register.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDAO studentDao;

	public void addStudent(Student student) {
		studentDao.addStudent(student);
	}

	public List<Student> getStudents() {
		List<Student> list = studentDao.getStudents();
		return list;
	}

	public Student getStudentById(int id) {
		Student student = studentDao.getStudentById(id);
		return student;
	}

	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}
}
