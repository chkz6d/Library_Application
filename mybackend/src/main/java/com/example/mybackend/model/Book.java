package com.example.mybackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	private Integer id;
	
	private String name;
	
	@OneToOne
	private Library library;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", library=" + library + "]";
	}

	public Book(Integer id, String name, Library library) {
		super();
		this.id = id;
		this.name = name;
		this.library = library;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
