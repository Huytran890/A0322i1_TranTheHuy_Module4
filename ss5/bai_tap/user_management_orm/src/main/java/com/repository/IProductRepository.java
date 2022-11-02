package com.repository;

import com.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> productAll();

    void create(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void delete(int id);

    List<Product> search(String name);
}
