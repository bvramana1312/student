package com.bvr.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvr.student.domain.Student;
import com.bvr.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudent(int studentId) {
		return studentRepository.getById(studentId);
		
	}
	
	public List<Student> getStudents() {
		return studentRepository.findAll();
		
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
		
	}
	

}
