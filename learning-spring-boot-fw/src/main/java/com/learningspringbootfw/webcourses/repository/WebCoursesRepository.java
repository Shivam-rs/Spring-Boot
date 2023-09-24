package com.learningspringbootfw.webcourses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspringbootfw.webcourses.bean.WebCourse;

public interface WebCoursesRepository extends JpaRepository<WebCourse,Long>{

}
