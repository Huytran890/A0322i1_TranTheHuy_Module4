package com.codegym.blog.service;

import com.codegym.blog.model.BlogType;

import java.util.List;

public interface IBlogTypeService {
    List<BlogType> findAll();
}
