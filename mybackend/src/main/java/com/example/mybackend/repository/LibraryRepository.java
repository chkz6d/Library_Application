package com.example.mybackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mybackend.model.Library;

public interface LibraryRepository extends CrudRepository<Library, String>{

}
