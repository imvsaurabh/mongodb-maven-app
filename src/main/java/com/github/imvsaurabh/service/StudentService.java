package com.github.imvsaurabh.service;

import java.util.List;

import com.github.imvsaurabh.model.Address;
import com.github.imvsaurabh.model.Course;
import com.github.imvsaurabh.model.Student;
import com.github.imvsaurabh.repo.StudentRepo;

public class StudentService {

	public void findAllStudent() {
		List<Student> students = StudentRepo.findAllStudent();

		if (!students.isEmpty()) {
			System.out.println("==================================STUDENTS===================================");
			students.forEach(System.out::println);
		}
	}

	public void findAllAddress() {
		List<Address> addresses = StudentRepo.findAllAddress();

		if (!addresses.isEmpty()) {
			System.out.println("==================================ADDRESS===================================");
			addresses.forEach(System.out::println);
		}
	}

	public void findAllCourse() {
		List<Course> courses = StudentRepo.findAllCourse();

		if (!courses.isEmpty()) {
			System.out.println("==================================COURSE===================================");
			courses.forEach(System.out::println);
		}
	}
}
