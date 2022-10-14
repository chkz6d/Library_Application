package com.example.mybackend.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybackend.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	//Get all Books
	public List<Book> getAllBook(){
		List<Book> book = new ArrayList<>();
		
		bookRepository.findAll()
		.forEach(book::add);
		
		return book;
	}
	
	//Get all books by Library Id
	public List<Book> getBooksByLibrary(String id){
		return bookRepository.findByLibraryId(id);
	}
	//Find the book by Id
	public Optional<Book> getBook(String id){
		return bookRepository.findById(id);
	}
	
	//Create a book
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	//Update book
	public void updateBook(String id, Book book) {
		bookRepository.save(book);
	}
	
	//delete a book
	public void deleteBook(String id) {
		bookRepository.deleteById(id);
	}
	
	
}
