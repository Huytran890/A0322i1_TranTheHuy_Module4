package vn.codegym.users.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import vn.codegym.users.model.User;
import vn.codegym.users.repository.IUserRepository;
import vn.codegym.users.service.IUserService;

import java.awt.print.Pageable;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return this.userRepository.findAll(pageable);
    }

    @Override
    public void create(User user) {
        this.userRepository.save(user);
    }
}
