package com.example.mybackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mybackend.model.Library;
import com.example.mybackend.repository.LibraryRepository;

@RestController
public class LibraryController {

	@Autowired
	private LibraryRepository libraryRepository;
	
	// Print all library
	@GetMapping("/library")
	public List<Library> getAllLibrary() {
		List<Library> list = libraryRepository.findAll();
		return list;
	}
	
}
