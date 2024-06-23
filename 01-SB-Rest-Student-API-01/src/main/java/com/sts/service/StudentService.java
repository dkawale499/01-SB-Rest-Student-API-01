package com.sts.service;

import java.util.List;

import com.sts.entity.Student;

public interface StudentService {

	public String createStudent(Student student);
	public String updatestudent(Student student);
	public String deleteStudent(String studentid);
	public Student getStudent(Integer studentid);
	public List<Student>getAllStudent();
}
