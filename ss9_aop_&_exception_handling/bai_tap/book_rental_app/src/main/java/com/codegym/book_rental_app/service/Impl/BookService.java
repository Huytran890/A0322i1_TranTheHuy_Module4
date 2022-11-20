package com.codegym.book_rental_app.service.Impl;

import com.codegym.book_rental_app.model.Book;
import com.codegym.book_rental_app.repository.IBookRepository;
import com.codegym.book_rental_app.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;

@Service
public class BookService implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public Page<Book> findAll(Pageable pageable) {
        return this.bookRepository.findAll(pageable);
    }

    @Override
    public void save(Book book) {
        this.bookRepository.save(book);
    }

    @Override
    public void delete(Book book) {
        this.bookRepository.delete(book);
    }

    @Override
    public Book findById(Integer id) {
        return this.bookRepository.findById(id).orElse(null);
    }
}
