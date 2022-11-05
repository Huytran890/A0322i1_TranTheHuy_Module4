package com.codegym.update_blog.service;

import com.codegym.update_blog.model.AppBlog;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;
import java.util.List;

public interface IAppBlogService {
    List<AppBlog> findAll();

    void save(AppBlog appBlog);

    void deleteById(int id);

    AppBlog findById(int id);

    Page<AppBlog> listSearchByName(String keywordVal, Pageable pageable);

}
