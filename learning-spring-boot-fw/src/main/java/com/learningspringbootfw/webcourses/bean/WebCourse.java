package com.learningspringbootfw.webcourses.bean;

public class WebCourse {
	private long id;
	private String name;
	private String author;

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
