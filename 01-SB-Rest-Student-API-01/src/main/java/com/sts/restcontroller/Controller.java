package com.sts.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.entity.Student;
import com.sts.service.StudentService;

@RestController

public class Controller {

	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/student")
	public ResponseEntity<String>createStudentData(@RequestBody Student student){
		String status = studentservice.createStudent(student);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}
	
	@GetMapping("/student/{studentid}")
	public ResponseEntity<Student>getStudent(@PathVariable Integer studentid){
		Student student = studentservice.getStudent(studentid);
		return new ResponseEntity<>(student, HttpStatus.OK);

	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>>getAllStudent(){
		List<Student> allStudent = studentservice.getAllStudent();
		return new ResponseEntity<>(allStudent, HttpStatus.OK);


	}
	
	
	
	

	
}

