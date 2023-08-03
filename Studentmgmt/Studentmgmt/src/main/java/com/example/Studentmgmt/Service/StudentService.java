package com.example.Studentmgmt.Service;

import java.util.List;

import com.example.Studentmgmt.Exception.StudentException;
import com.example.Studentmgmt.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	public Student findById(int theId) throws StudentException;

	public Student save(Student thestudent);

	public void deleteById(int theId);

	//public List<Student> searchBy(String firstName, String course);

}
