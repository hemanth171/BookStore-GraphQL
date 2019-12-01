package com.hemanth.bookstore.service;

import com.hemanth.bookstore.model.Author;
import com.hemanth.bookstore.model.Book;
import com.hemanth.bookstore.repository.AuthorRepository;
import com.hemanth.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }
}
