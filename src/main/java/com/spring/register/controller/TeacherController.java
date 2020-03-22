package com.spring.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.register.model.Teacher;
import com.spring.register.service.TeacherService;

@Controller
public class TeacherController {

	@Autowired
	TeacherService teacherService;

	@RequestMapping("/teacherForm")
	public String showform(Model m) {
		m.addAttribute("command", new Teacher());
		return "teacherForm";
	}

	@RequestMapping(value = "/addTeacher", method = RequestMethod.POST)
	public String save(@ModelAttribute("teacher") Teacher teacher) {
		teacherService.addTeacher(teacher);
		return "redirect:/viewTeacher";
	}

	@RequestMapping("/viewTeacher")
	public String viewTeachers(Model m) {
		List<Teacher> list = teacherService.getTeachers();
		m.addAttribute("list", list);
		return "viewTeacher";
	}

	@RequestMapping(value = "/editTeacher/{id}")
	public String edit(@PathVariable int id, Model m) {
		Teacher teacher = teacherService.getTeacherById(id);
		teacher.setTeacherId(id);
		m.addAttribute("command", teacher);
		return "editTeacher";
	}

	@RequestMapping(value = "editTeacher/edit", method = RequestMethod.POST)
	public String editTeacher(@ModelAttribute("teacher") Teacher teacher, ModelMap model) {
		teacherService.updateTeacher(teacher);
		return "redirect:/viewTeacher";
	}

	@RequestMapping(value = "/deleteTeacher/{id}", method = RequestMethod.POST)
	public String deleteTeacher(@PathVariable int id) {
		teacherService.deleteTeacher(id);
		return "redirect:/viewTeacher";
	}

}
