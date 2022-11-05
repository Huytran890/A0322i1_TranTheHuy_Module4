package com.codegym.blog.repository;

import com.codegym.blog.model.BlogType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogTypeRepository extends JpaRepository<BlogType,Integer> {
}
