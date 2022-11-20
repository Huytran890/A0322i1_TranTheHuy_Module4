package com.codegym.book_rental_app.repository;

import com.codegym.book_rental_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
    User findAllByNameUserContaining(String name);
}
