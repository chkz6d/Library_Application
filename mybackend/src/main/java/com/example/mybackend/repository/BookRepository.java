package com.example.mybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mybackend.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
