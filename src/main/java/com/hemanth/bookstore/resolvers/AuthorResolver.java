//package com.hemanth.bookstore.resolvers;
//
//import com.coxautodev.graphql.tools.GraphQLResolver;
//import com.hemanth.bookstore.model.Publisher;
//import com.hemanth.bookstore.repository.AuthorRepository;
//import com.hemanth.bookstore.schema.Author;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.Optional;
//
//@Component
//public class AuthorResolver implements GraphQLResolver<Author> {
//
////    @Autowired
////    private AuthorRepository authorRepository;
//
//    public Optional<Publisher> getAuthor(Author author) {
//        return authorRepository.findById(author.getId());
//    }
//}
