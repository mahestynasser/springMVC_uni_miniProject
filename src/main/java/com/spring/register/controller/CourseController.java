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

import com.spring.register.model.Course;
import com.spring.register.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService courseService;

	@RequestMapping("/courseForm")
	public String showform(Model m) {
		m.addAttribute("command", new Course());
		return "courseForm";
	}

	@RequestMapping(value = "/addCourse", method = RequestMethod.POST)
	public String save(@ModelAttribute("course") Course course) {
		courseService.addCourse(course);
		return "redirect:/viewCourse";
	}

	@RequestMapping("/viewCourse")
	public String viewTeachers(Model m) {
		List<Course> list = courseService.getCourses();
		m.addAttribute("list", list);
		return "viewCourse";
	}

	@RequestMapping(value = "/editCourse/{id}")
	public String edit(@PathVariable int id, Model m) {
		Course course = courseService.getCourseById(id);
		course.setCourseId(id);
		m.addAttribute("command", course);
		return "editCourse";
	}

	@RequestMapping(value = "editCourse/edit", method = RequestMethod.POST)
	public String editCourse(@ModelAttribute("course") Course course, ModelMap model) {
		courseService.updateCourse(course);
		return "redirect:/viewCourse";
	}

	@RequestMapping(value = "/deleteCourse/{id}", method = RequestMethod.POST)
	public String deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
		return "redirect:/viewCourse";
	}
}