package com.web.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
