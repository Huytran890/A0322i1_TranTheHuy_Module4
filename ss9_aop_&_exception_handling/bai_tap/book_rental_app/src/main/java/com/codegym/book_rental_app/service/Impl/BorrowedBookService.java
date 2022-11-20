package com.codegym.book_rental_app.service.Impl;

import com.codegym.book_rental_app.model.BorrowedBook;
import com.codegym.book_rental_app.repository.IBorrowedBookRepository;
import com.codegym.book_rental_app.service.IBorrowedBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowedBookService implements IBorrowedBookService {
    @Autowired
    IBorrowedBookRepository borrowedBookRepository;

    @Override
    public void save(BorrowedBook borrowedBook) {
        borrowedBookRepository.save(borrowedBook);
    }

    @Override
    public BorrowedBook findByBorrowedBook(String borrowed) {
        return borrowedBookRepository.findByBorrowedBook(borrowed);
    }

    @Override
    public void delete(BorrowedBook borrowedBook) {
        borrowedBookRepository.delete(borrowedBook);
    }
}
