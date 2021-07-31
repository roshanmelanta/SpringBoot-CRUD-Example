package com.cg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.demo.entity.Student;
import com.cg.demo.exception.StudentNotFoundException;
import com.cg.demo.service.StudentService;

@RestController
//@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private StudentService service;

	@GetMapping("/students")
    public List<Student> getAllStudent() {
		return service.getAllStudents();
    }
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id) throws StudentNotFoundException {
		Student student = service.getStudent(id);
		if(student!=null) {
			return student;
		}
		else {
			throw new StudentNotFoundException("Student with ID "+id+" does not exist");
		}
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return service.updateStudent(student);
	}
	
	@DeleteMapping("/student/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return service.deleteStudent(id);
	}

}
