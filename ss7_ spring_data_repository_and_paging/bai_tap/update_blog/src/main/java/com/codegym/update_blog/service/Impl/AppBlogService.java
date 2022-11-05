package com.codegym.update_blog.service.Impl;

import com.codegym.update_blog.model.AppBlog;
import com.codegym.update_blog.repository.IAppBlogRepository;
import com.codegym.update_blog.service.IAppBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class AppBlogService implements IAppBlogService {
    @Autowired
    private IAppBlogRepository appBlogRepository;

    @Override
    public List<AppBlog> findAll() {
        return this.appBlogRepository.findAll();
    }

    @Override
    public void save(AppBlog appBlog) {

        this.appBlogRepository.save(appBlog);
    }

    @Override
    public void deleteById(int id) {
        this.appBlogRepository.deleteById(id);
    }

    @Override
    public AppBlog findById(int id) {
        return this.appBlogRepository.findById(id).orElse(null);
    }

    @Override
    public Page<AppBlog> listSearchByName(String keywordVal, Pageable pageable) {
        return this.appBlogRepository.findAllByNameBlogContaining(keywordVal, pageable);
    }
}