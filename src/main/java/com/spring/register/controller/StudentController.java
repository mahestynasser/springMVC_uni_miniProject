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

import com.spring.register.model.Student;
import com.spring.register.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping("/studentForm")
	public String showform(Model m) {
		m.addAttribute("command", new Student());
		return "studentForm";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String save(@ModelAttribute("student") Student student, ModelMap model) {
		model.addAttribute("name", student.getName());
		model.addAttribute("email", student.getEmail());
		studentService.addStudent(student);
		return "redirect:/viewStudent";// will redirect to viewStudent request mapping
	}
	
	
	//GET
	/* It provides list of students in model object */    
    @RequestMapping("/viewStudent")    
    public String viewStudents(Model m){    
        List<Student> list=studentService.getStudents();    
        m.addAttribute("list",list);  
        return "viewStudent";    
    }  
//    
    //UPDATE
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/    
    @RequestMapping(value="/editStudent/{id}")    
    public String edit(@PathVariable int id, Model m){    
    	Student student=studentService.getStudentById(id);    
    	student.setStudentId(id);
//    	System.out.println(student.getName() + " " + student.getEmail() + " " + student.getStudentId() + " " + id);
//    	System.out.println("controller");
        m.addAttribute("command",student); 
//        System.out.println("controller2");
        return "editStudent";    
    }    
    
    /* It updates model object. */    
    @RequestMapping(value="/editStudent/edit",method = RequestMethod.POST)   //http://localhost:8080/register/editStudent/test/editStudentTest  
    public String editStudent(@ModelAttribute("student") Student student,  ModelMap model){  
//    	System.out.println(student.toString());
//    	System.out.println(student.getStudentId());
//    	System.out.println("controller3");

    	studentService.updateStudent(student);    
        return "redirect:/viewStudent";    
    }    
    
    //DELETE
    /* It deletes record for the given id in URL and redirects to /viewStudent */    
    @RequestMapping(value="/deleteStudent/{id}",method = RequestMethod.POST)    
    public String deleteStudent(@PathVariable int id){    
    	studentService.deleteStudent(id);    
        return "redirect:/viewStudent";    
	}

}
