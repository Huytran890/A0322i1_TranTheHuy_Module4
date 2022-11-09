package vn.codegym.users.service;

import org.springframework.data.domain.Page;
import vn.codegym.users.model.User;

import java.awt.print.Pageable;

public interface IUserService {
    Page<User> findAll(Pageable pageable);

    void create(User user);
}
