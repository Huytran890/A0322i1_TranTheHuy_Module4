package com.codegym.blog.service;

import com.codegym.blog.model.AppBlog;

import java.util.List;

public interface IAppBlogService {
    List<AppBlog> findAll();

    void save(AppBlog appBlog);

    void deleteById(int id);

    AppBlog findById(int id);

    List<AppBlog> listSearch(String name);

}
