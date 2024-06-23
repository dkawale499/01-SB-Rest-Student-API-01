package com.sts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.entity.Student;
import com.sts.repo.StudentRepository;
@Service
public class StudentImplService implements StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
	@Override
	public String createStudent(Student student) {
		studentrepo.save(student);
		System.out.println("saved");
		return "created Sucsess";
	}

	@Override
	public String updatestudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(String studentid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudent(Integer studentid) {
		Optional<Student> findById = studentrepo.findById(studentid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		return studentrepo.findAll();
		
	}

}
