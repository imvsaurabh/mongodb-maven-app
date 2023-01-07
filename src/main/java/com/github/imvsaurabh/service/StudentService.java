package com.github.imvsaurabh.service;

import java.util.List;

import com.github.imvsaurabh.model.Address;
import com.github.imvsaurabh.model.Course;
import com.github.imvsaurabh.model.Student;
import com.github.imvsaurabh.repo.StudentRepo;

public class StudentService {
	
	StudentRepo studentRepo = new StudentRepo();

	public List<Student> findAllStudent() {
		
		List<Student> students = studentRepo.findAllStudent();

		if (!students.isEmpty()) {
			System.out.println("==================================STUDENTS===================================");
			students.forEach(System.out::println);
		}
		return students;
	}

	public List<Address> findAllAddress() {
		List<Address> addresses = studentRepo.findAllAddress();

		if (!addresses.isEmpty()) {
			System.out.println("==================================ADDRESS===================================");
			addresses.forEach(System.out::println);
		}
		return addresses;
	}

	public List<Course> findAllCourse() {
		List<Course> courses = studentRepo.findAllCourse();

		if (!courses.isEmpty()) {
			System.out.println("==================================COURSE===================================");
			courses.forEach(System.out::println);
		}
		
		return courses;
	}
}
