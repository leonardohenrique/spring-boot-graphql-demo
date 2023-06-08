package com.example.graphqldemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.graphqldemo.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
