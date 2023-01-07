package com.github.imvsaurabh.repo;

import static com.github.imvsaurabh.constant.Constant.DATABASE_NAME;
import static com.github.imvsaurabh.constant.Constant.STUDENT_COLLECTION;
import static com.github.imvsaurabh.constant.Constant.COURSE_COLLECTION;
import static com.github.imvsaurabh.constant.Constant.ADDRESS_COLLECTION;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.imvsaurabh.config.Configurations;
import com.github.imvsaurabh.model.Address;
import com.github.imvsaurabh.model.Course;
import com.github.imvsaurabh.model.Student;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class StudentRepo {
	private static Logger log = LoggerFactory.getLogger(StudentRepo.class);
	
	public static List<Student> findAllStudent() {
		List<Student> students = null;
		log.info("FindAll Initiated.");
		try (MongoClient client = Configurations.mongoClient()) {
			
			MongoDatabase studentDB = client.getDatabase(DATABASE_NAME);
			
			MongoCollection<Student> student = studentDB.getCollection(STUDENT_COLLECTION, Student.class);
			
			students = student.find().into(new ArrayList<>());
			
			log.info("Total Students : {}", students.size());
		} catch (Exception e) {
			log.error("Connection Failed.");
			e.printStackTrace();
		}
		
		return students;
	}
	
	public static List<Course> findAllCourse() {
		List<Course> courses = null;
		log.info("FindAll Initiated.");
		try (MongoClient client = Configurations.mongoClient()) {
			
			MongoDatabase studentDB = client.getDatabase(DATABASE_NAME);
			
			MongoCollection<Course> course = studentDB.getCollection(COURSE_COLLECTION, Course.class);
			
			courses = course.find().into(new ArrayList<>());
			
			log.info("Total Courses : {}", courses.size());
		} catch (Exception e) {
			log.error("Connection Failed.");
			e.printStackTrace();
		}
		
		return courses;
	}
	
	public static List<Address> findAllAddress() {
		List<Address> addresses = null;
		log.info("FindAll Initiated.");
		try (MongoClient client = Configurations.mongoClient()) {
			
			MongoDatabase studentDB = client.getDatabase(DATABASE_NAME);
			
			MongoCollection<Address> address = studentDB.getCollection(ADDRESS_COLLECTION, Address.class);
			
			addresses = address.find().into(new ArrayList<>());
			
			log.info("Total Addresses : {}", addresses.size());
		} catch (Exception e) {
			log.error("Connection Failed.");
			e.printStackTrace();
		}
		
		return addresses;
	}
}
