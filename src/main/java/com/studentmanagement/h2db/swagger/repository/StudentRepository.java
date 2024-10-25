package com.studentmanagement.h2db.swagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmanagement.h2db.swagger.entitiy.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

