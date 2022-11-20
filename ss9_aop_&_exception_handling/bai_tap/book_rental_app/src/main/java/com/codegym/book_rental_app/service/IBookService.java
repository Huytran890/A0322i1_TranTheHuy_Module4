package com.codegym.book_rental_app.service;

import com.codegym.book_rental_app.model.Book;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface IBookService {
    Page<Book> findAll(Pageable pageable);

    void save(Book book);

    void delete(Book book);

    Book findById(Integer id);
}
