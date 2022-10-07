package com.example.mybackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybackend.model.Book;
import com.example.mybackend.model.Library;
import com.example.mybackend.repository.BookRepository;
import com.example.mybackend.repository.LibraryRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	//Print all the books
	@GetMapping("/book")
	public List<Book> getAllBook(){
		List<Book> list = bookRepository.findAll();
		return list;
	}
	
	//Create New book in the library 
	@PostMapping("/book/{lid}")
	public Book postBook(@RequestBody Book book, @PathVariable("lid") Integer lid) {
		
		Optional<Library> optional = libraryRepository.findById(lid);
		if(!optional.isPresent())
			throw new RuntimeException("Library ID is Invalid!!!!");
		Library library;
		
		library = optional.get();
		book.setLibrary(library);

		return bookRepository.save(book);
	}
	
	//Delete the book
	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable("id") Integer id) {
		bookRepository.deleteById(id);
		System.out.println("Successfully deleted the BOOK");
	}
}
