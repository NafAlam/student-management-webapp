package com.nafalam.sma.service;

import java.util.List;

import com.nafalam.sma.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);

	void deleteStudentById(Long id);
	
	

}
