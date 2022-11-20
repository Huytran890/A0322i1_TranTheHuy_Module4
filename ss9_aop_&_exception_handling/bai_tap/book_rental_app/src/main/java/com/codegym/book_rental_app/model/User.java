package com.codegym.book_rental_app.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameUser;

    @OneToMany(mappedBy = "user")
    private List<BorrowedBook> borrowedBook;

    public User() {
    }

    public User(Integer id, String nameUser, List<BorrowedBook> borrowedBook) {
        this.id = id;
        this.nameUser = nameUser;
        this.borrowedBook = borrowedBook;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public List<BorrowedBook> getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(List<BorrowedBook> borrowedBook) {
        this.borrowedBook = borrowedBook;
    }
}
