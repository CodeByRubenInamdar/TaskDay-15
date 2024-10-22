package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepositroy;

@Service
public class StudentService {

	@Autowired
	private StudentRepositroy studentRepository;

	// Create a new student
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}

	// Get all students
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	// Get a student by ID
	public Optional<Student> getStudentById(int id) {
		return studentRepository.findById(id);
	}

	// Update an existing student
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	// Delete a student by ID
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}
