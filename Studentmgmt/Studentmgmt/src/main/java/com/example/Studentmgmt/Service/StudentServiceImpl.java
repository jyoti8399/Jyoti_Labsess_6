package com.example.Studentmgmt.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Studentmgmt.Exception.StudentException;
import com.example.Studentmgmt.entity.Student;
import com.example.Studentmgmt.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	public StudentRepository getStudentRepository() {
		return studentRepository;
	}

	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findById(int theId) throws StudentException {
		Optional<Student> studentOptional = studentRepository.findById(theId);
		if (studentOptional.isPresent()) {
			return studentOptional.get();
		}

		throw new StudentException("Student Details not present");
	}

	@Override
	@Transactional
	public Student save(Student thestudent) {
		return studentRepository.save(thestudent);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		studentRepository.deleteById(theId);
	}
}
