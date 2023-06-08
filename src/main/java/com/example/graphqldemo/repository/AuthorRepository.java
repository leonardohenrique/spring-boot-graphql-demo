package com.example.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqldemo.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
