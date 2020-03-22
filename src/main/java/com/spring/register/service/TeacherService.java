package com.spring.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.register.dao.TeacherDAO;
import com.spring.register.model.Teacher;

@Service
public class TeacherService {

	@Autowired
	TeacherDAO teacherDao;

	public void addTeacher(Teacher teacher) {
		teacherDao.addTeacher(teacher);
	}

	public List<Teacher> getTeachers() {
		List<Teacher> list = teacherDao.getTeachers();
		return list;
	}

	public Teacher getTeacherById(int id) {
		Teacher teacher = teacherDao.getTeacherById(id);
		return teacher;
	}

	public void updateTeacher(Teacher teacher) {
		teacherDao.updateTeacher(teacher);
	}

	public void deleteTeacher(int id) {
		teacherDao.deleteTeacher(id);
	}
}
