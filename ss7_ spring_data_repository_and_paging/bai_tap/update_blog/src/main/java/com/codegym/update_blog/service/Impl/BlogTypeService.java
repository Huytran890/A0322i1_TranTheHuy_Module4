package com.codegym.update_blog.service.Impl;

import com.codegym.update_blog.model.BlogType;
import com.codegym.update_blog.repository.IBlogTypeRepository;
import com.codegym.update_blog.service.IBlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeService implements IBlogTypeService {
    @Autowired
    private IBlogTypeRepository blogTypeRepository;

    @Override
    public List<BlogType> findAll() {
        return this.blogTypeRepository.findAll();
    }
}
