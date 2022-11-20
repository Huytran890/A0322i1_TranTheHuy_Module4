package com.codegym.shopping_cart.service.Impl;

import com.codegym.shopping_cart.model.Product;
import com.codegym.shopping_cart.repository.IProductRepository;
import com.codegym.shopping_cart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Iterable<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return this.productRepository.findById(id);
    }
}
