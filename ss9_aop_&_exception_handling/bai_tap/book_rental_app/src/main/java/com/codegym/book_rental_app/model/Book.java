package com.codegym.book_rental_app.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book_management")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeBook;
    private String nameBook;
    private Integer quantity;
    private Integer currentQuantity;

    @OneToMany(mappedBy = "book")
    private List<BorrowedBook> borrowedBook;

    public Book() {
    }

    public Book(Integer id, String codeBook, String nameBook, Integer quantity, Integer currentQuantity,
                List<BorrowedBook> borrowedBook) {
        this.id = id;
        this.codeBook = codeBook;
        this.nameBook = nameBook;
        this.quantity = quantity;
        this.currentQuantity = currentQuantity;
        this.borrowedBook = borrowedBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeBook() {
        return codeBook;
    }

    public void setCodeBook(String codeBook) {
        this.codeBook = codeBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(Integer currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public List<BorrowedBook> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(List<BorrowedBook> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}
