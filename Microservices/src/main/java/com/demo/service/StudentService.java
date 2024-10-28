package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Student;
import com.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public Student getStudentById(Integer id) {
		return studentRepository.findById(id).orElse(null);
	}
	
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Long id,Student student) {
		student.setId(id);
		return studentRepository.save(student);
	}
	
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}
}
