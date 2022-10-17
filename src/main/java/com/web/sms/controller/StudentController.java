package com.web.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.sms.entity.Student;
import com.web.sms.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;

	// read all students
	@GetMapping("/students")
	public String getAllStudent(Model m) {
		m.addAttribute("students", studentService.getAllStudent());
		return "students";
	}

	// open form
	@GetMapping("students/new")
	public String createStudentForm(Model model) {
		model.addAttribute("student", new Student());
		return "create_student";

	}

	// add student
	@PostMapping("/students")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/students";
	}

	// open update student form
	@GetMapping("/students/update/{id}")
	public String getStudentById(Model model, @PathVariable("id") long id) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "update";
	}

	// update student
	@PostMapping("/students/update/{id}")
	public String updateStudent(@PathVariable("id") long id, @ModelAttribute("student") Student student) {
		studentService.updateStudent(id, student);
		return "redirect:/students";
	}

	// open update student form
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable("id") long id) {
		studentService.deleteStudent(id);
		return "redirect:/students";
	}

}
