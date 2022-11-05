package com.service;

public interface IProductService {
    List<Product> listAll();

    void create(Product product);

    Product findById(int id);

    void delete(Product product);

    void edit(int id, Product product);

    List<Product> search(String name);
}

