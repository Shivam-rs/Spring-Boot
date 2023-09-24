package com.learningspringbootfw.webcourses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learningspringbootfw.webcourses.bean.WebCourse;
import com.learningspringbootfw.webcourses.repository.WebCoursesRepository;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@RestController
public class WebCourseController {
//http://localhost:8080/courses
	
	@Autowired
	private WebCoursesRepository repo;	
	
	@GetMapping("/courses")
	public List<WebCourse> getAllCourses() {
		
		return repo.findAll();
//		return List.of(new WebCourse(1, "Turning Pro", "Shivam"),
//				new WebCourse(2, "Turning noob", "Rishu") );
	}
	
	
		@GetMapping("/courses/{id}")
		public WebCourse getOneCourses(@PathVariable long id) {
			
			Optional<WebCourse> findCourseID = repo.findById(id);
			
			if(findCourseID.isEmpty()) {
				throw new RuntimeException("Course not found with following ID:" + id);
			}
			return findCourseID.get();
			
			//return new WebCourse(1, "Turning Pro...", "S. Shivam");

	}
	
	@PostMapping("/courses")
	public void createNewCourse(@RequestBody WebCourse newCourse) {
		repo.save(newCourse);
	}
		
	@PutMapping("/courses/{id}")
	public void updateCourses(@PathVariable long id,@RequestBody WebCourse updateCourse) {
		repo.save(updateCourse);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourses(@PathVariable long id) {
		repo.deleteById(id);
	}
	
//	docker run --detach 
//	--env MYSQL_ROOT_PASSWORD=dummypassword 
//	--env MYSQL_USER=courses-user 
//	--env MYSQL_PASSWORD=dummycourses 
//	--env MYSQL_DATABASE=courses 
//	--name mysql 
//	--publish 3306:3306 mysql:5.7
	
}
