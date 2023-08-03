package com.example.Studentmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Studentmgmt.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	//List<Student> findByFirstNameContainsAndCourseContainsAllIgnoreCase(String firstName, String course);

}