package com.example.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqldemo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
