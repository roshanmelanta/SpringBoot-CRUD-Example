package com.cg.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.entity.Student;
import com.cg.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;

	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	public Student getStudent(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public Student addStudent(Student student) {
		return repo.save(student);
	}
	
	public Student updateStudent(Student student) {
		return repo.save(student);
	}
	
	public String deleteStudent(int id) {
		Student student = getStudent(id);
		repo.delete(student);
		return "Student with ID "+id+" has been deleted";
	}

}
