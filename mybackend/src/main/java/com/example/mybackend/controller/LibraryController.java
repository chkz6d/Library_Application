package com.example.mybackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybackend.model.Library;
import com.example.mybackend.model.LibraryService;

@RestController
public class LibraryController {
	
	@Autowired
	private LibraryService libraryService;

	//Print all Library
	@GetMapping("/library")
	public List<Library> getAllLibrary(){
		return libraryService.getAllLibrary();
	}
	
	//Fetch the library by Id
	@GetMapping("/library/{id}")
    public Optional<Library> getLibraryById(@PathVariable String id){
		return libraryService.getLibraryById(id);
    }
	
}
