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
import com.example.mybackend.model.BookService;
import com.example.mybackend.model.Library;
import com.example.mybackend.model.LibraryService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private LibraryService libraryService;
	
	//Print all the books
	@GetMapping("/book")
	public List<Book> getAllBook(){
		return bookService.getAllBook();
	}
	
	//Fetch a Book by Book Id
	@GetMapping("/book/{id}")
	public Optional<Book> getBook(@PathVariable String id){
		return bookService.getBook(id);
	}
	
	//Print Books by Library Id
	@GetMapping("book/library/{id}")
	public List<Book> getBooksByLibraryId(@PathVariable String id){
		return bookService.getBooksByLibrary(id);
	}
	
	//Create a Book
	@PostMapping("/book/{lid}")
	public void addBook(@RequestBody Book book, @PathVariable("lid") String lid) {
		Optional<Library> optional = libraryService.getLibraryById(lid);
		if(!optional.isPresent())
			throw new RuntimeException("Library ID is Invalid!!!!");
		Library library;
		
		library = optional.get();
		book.setLibrary(library);
		bookService.addBook(book);
	}
	
	//Delete the book
	@DeleteMapping("/book/{id}")
	public void deleteBook(@PathVariable("id") String id) {
		bookService.deleteBook(id);
		System.out.println("Successfully deleted the BOOK");
	}
}
