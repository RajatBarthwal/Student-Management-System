package com.web.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}

}
