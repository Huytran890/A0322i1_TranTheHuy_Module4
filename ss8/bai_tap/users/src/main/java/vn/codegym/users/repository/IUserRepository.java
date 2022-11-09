package vn.codegym.users.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.users.model.User;

import java.awt.print.Pageable;

public interface IUserRepository extends JpaRepository<User, Integer> {
    Page<User> findAll(Pageable pageable);
}

