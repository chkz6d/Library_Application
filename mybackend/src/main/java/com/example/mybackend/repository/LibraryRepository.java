package com.example.mybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mybackend.model.Library;

public interface LibraryRepository extends JpaRepository<Library, Integer>{

}
