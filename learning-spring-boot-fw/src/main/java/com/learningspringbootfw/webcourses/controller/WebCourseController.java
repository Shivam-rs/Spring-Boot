package com.learningspringbootfw.webcourses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningspringbootfw.webcourses.bean.WebCourse;

@RestController
public class WebCourseController {
//http://localhost:8080/courses
	@GetMapping("/courses")

	public List<WebCourse> getAllCourses() {
		return List.of(new WebCourse(1, "Turning Pro", "Shivam"));

	}
}
