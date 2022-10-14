package com.example.mybackend.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mybackend.repository.LibraryRepository;
//all the logic application comes from business logic
//all the actions and activity is done in service
@Service
public class LibraryService {

	@Autowired
	private LibraryRepository libraryRepository;
	
	
	//Get all libraries
	public List<Library> getAllLibrary(){
		List<Library> library = new ArrayList<>();
		
		libraryRepository.findAll()
		.forEach(library::add);
		
		return library;
	}
	
	//Find the library by Id
	public Optional<Library> getLibraryById(String id){
		return libraryRepository.findById(id);
	}
	
	//create a library
	public void addLibrary(Library library) {
		libraryRepository.save(library);
	}
}
