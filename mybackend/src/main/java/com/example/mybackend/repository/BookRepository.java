package com.example.mybackend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.mybackend.model.Book;

public interface BookRepository extends CrudRepository<Book, String>{
	
	public List<Book> findByLibraryId(String library);
}
