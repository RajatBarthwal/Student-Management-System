package com.web.sms.service;

import java.util.List;

import com.web.sms.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudent();
	
	Student getStudentById(long id);
	
	void addStudent(Student student);
	
	void updateStudent(Long id, Student student);
	
	void deleteStudent(long id);
}
