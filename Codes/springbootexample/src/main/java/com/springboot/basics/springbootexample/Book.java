package com.springboot.basics.springbootexample;

public class Book {
private long id;
private String name;
private String author;
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
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
public Book(long id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}
}
