package com.codegym.book_rental_app.repository;

import com.codegym.book_rental_app.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface IBookRepository extends JpaRepository<Book, Integer> {
    Page<Book> findAll(Pageable pageable);
}
