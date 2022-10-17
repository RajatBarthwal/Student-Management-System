package com.web.sms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.sms.entity.Student;
import com.web.sms.repository.StudentRepository;
import com.web.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		List<Student> allStudent = studentRepository.findAll();
		return allStudent;
	}

	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();

	}

	@Override
	public void addStudent(Student student) {
		studentRepository.save(student);
	}

	@Override
	public void updateStudent(Long id, Student student) {
		Student presentstudent = studentRepository.findById(id).get();
		presentstudent.setFirstName(student.getFirstName());
		presentstudent.setLastName(student.getLastName());
		presentstudent.setEmail(student.getEmail());

		studentRepository.save(presentstudent);

	}

	@Override
	public void deleteStudent(long id) {
		studentRepository.deleteById(id);
		
	}

}
