package com.service;

public interface IAppBlogService {
    List<AppBlog> findAll();

    void save(AppBlog appBlog);

    void deleteById(int id);

    AppBlog findById(int id);

    List<AppBlog> listSearch(String name);

}
