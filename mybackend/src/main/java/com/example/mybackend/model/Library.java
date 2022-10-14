package com.example.mybackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Library")
public class Library {

	@Id
	private String id;
	
	@Column(length = 255, nullable = false)
	private String name;

	public Library(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}



	
}
