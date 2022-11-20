package com.codegym.book_rental_app.service.Impl;

import com.codegym.book_rental_app.model.User;
import com.codegym.book_rental_app.repository.IUserRepository;
import com.codegym.book_rental_app.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void save(User user) {
        this.userRepository.save(user);
    }

    @Override
    public User findByName(String name) {
        return this.userRepository.findAllByNameUserContaining(name);
    }

    @Override
    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
