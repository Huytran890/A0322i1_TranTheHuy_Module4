package com.codegym.update_blog.repository;

import com.codegym.update_blog.model.BlogType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogTypeRepository extends JpaRepository<BlogType,Integer> {
}
