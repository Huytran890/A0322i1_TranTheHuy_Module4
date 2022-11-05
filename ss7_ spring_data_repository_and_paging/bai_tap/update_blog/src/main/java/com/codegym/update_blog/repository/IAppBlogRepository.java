package com.codegym.update_blog.repository;

import com.codegym.update_blog.model.AppBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface IAppBlogRepository extends JpaRepository<AppBlog, Integer> {
    Page<AppBlog> findAllByNameBlogContaining(String name, Pageable pageable);
}
