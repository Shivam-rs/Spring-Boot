package com.learningspringbootfw.webcourses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity//name ="Web Courses")
public class WebCourse {
	
	@Id
	@GeneratedValue
	
	//@Column(name="Book ID")
	private long id;
	
	//@Column(name="BooK Name")
	private String name;
	
	//@Column(name="Book Author")
	private String author;

	public WebCourse() {
		
	}
	
	public WebCourse(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "WebCourse [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

}
