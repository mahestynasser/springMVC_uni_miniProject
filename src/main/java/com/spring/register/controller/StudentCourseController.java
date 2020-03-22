package com.spring.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.register.model.StudentCourse;
import com.spring.register.service.StudentCourseService;

@Controller
public class StudentCourseController {

	@Autowired
	StudentCourseService studentCourseService;

	@RequestMapping("/studentCourseForm")
	public String showform(Model m) {
		m.addAttribute("command", new StudentCourse());
		return "studentCourseForm";
	}

	@RequestMapping(value = "/addStudentCourse", method = RequestMethod.POST)
	public String save(@ModelAttribute("studentCourse") StudentCourse studentCourse) {
		studentCourseService.addStudentCourse(studentCourse);
		return "redirect:/viewStudentCourse";
	}

	@RequestMapping("/viewStudentCourse")
	public String viewStudentCourses(Model m) {
		List<StudentCourse> list = studentCourseService.getStudentCourses();
		m.addAttribute("list", list);
		return "viewStudentCourse";
	}

	@RequestMapping(value = "/deleteStudentCourse/{studentId}/{courseId}", method = RequestMethod.POST)
	public String deleteStudentCourse(@PathVariable int studentId, @PathVariable int courseId) {
		studentCourseService.deleteStudentCourse(studentId, courseId);
		return "redirect:/viewStudentCourse";
	}
}