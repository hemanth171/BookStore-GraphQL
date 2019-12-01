package com.hemanth.bookstore.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.hemanth.bookstore.model.Author;
import com.hemanth.bookstore.model.Book;
import com.hemanth.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    @Autowired
    private BookService bookService;

    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }

    public List<Author> getAuthors() {
        return bookService.getAllAuthors();
    }
}
