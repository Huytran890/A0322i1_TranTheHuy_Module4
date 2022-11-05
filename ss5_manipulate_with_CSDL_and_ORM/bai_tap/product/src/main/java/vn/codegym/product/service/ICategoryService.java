package vn.codegym.product.service;

import vn.codegym.product.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
}
