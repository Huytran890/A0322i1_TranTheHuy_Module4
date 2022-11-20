package com.codegym.book_rental_app.service;

import com.codegym.book_rental_app.model.User;

public interface IUserService {
    void save(User user);

    User findByName(String name);

    void delete(User user);
}
