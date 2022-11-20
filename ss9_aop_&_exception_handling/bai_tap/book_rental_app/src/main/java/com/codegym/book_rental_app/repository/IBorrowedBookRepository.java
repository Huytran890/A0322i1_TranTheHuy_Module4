package com.codegym.book_rental_app.repository;

import com.codegym.book_rental_app.model.BorrowedBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowedBookRepository extends JpaRepository<BorrowedBook, Integer> {
    BorrowedBook findByBorrowedBook(String borrowed);
}
