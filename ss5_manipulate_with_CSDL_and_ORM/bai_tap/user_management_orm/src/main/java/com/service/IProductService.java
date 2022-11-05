package com.service;

import com.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> productAll();

    void create(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void delete(int id);

    List<Product> search(String name);
}