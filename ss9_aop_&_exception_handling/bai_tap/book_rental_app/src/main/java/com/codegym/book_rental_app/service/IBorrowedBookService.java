package com.codegym.book_rental_app.service;

import com.codegym.book_rental_app.model.BorrowedBook;

public interface IBorrowedBookService {
    void save(BorrowedBook borrowedBook);

    BorrowedBook findByBorrowedBook(String borrowed);

    void delete(BorrowedBook borrowedBook);
}