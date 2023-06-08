package com.example.graphqldemo.controller;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.example.graphqldemo.entity.Author;
import com.example.graphqldemo.entity.Book;
import com.example.graphqldemo.record.BookInput;
import com.example.graphqldemo.repository.AuthorRepository;
import com.example.graphqldemo.repository.BookRepository;
import com.example.graphqldemo.repository.GenreRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;
	private final GenreRepository genreRepository;

	@QueryMapping
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@QueryMapping
	public Book bookById(@Argument Long id) {
		return bookRepository.findById(id).orElse(null);
	}

	@MutationMapping
	public Book createBook(@Argument @Valid BookInput input) {
		final Book book = new Book();
		book.setTitle(input.title());
		book.setAuthorId(input.authorId());
		book.setGenres(genreRepository.findAllById(input.genreIds()));

		return bookRepository.save(book);
	}

	@SchemaMapping
	public Author author(Book book) {
		return authorRepository.findById(book.getAuthorId()).orElse(null);
	}

}
