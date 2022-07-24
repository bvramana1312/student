package com.bvr.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bvr.student.domain.Student;
import com.bvr.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@GetMapping("/all")
	public List<Student> getAllSudents() {
		return studentService.getStudents();
		
	}
	
	@GetMapping("/{studentId}")
	public Student getSudents(@PathVariable (value = "studentId") Integer studentId) {
		return studentService.getStudent(studentId);
		
	}
	
	@PostMapping
	public Student saveSudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}

}
