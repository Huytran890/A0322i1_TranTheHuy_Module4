package com.service.Impl;

@Service
public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public List<Product> productAll() {
        return this.productRepository.productAll();
    }

    @Override
    public void create(Product product) {
        this.productRepository.create(product);
    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void edit(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> search(String name) {
        return null;
    }
}
