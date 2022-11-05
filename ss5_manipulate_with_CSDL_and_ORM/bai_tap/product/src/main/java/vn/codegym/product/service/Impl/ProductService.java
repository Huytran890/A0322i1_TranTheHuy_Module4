package vn.codegym.product.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import vn.codegym.product.model.Product;
import vn.codegym.product.repository.IProductRepository;
import vn.codegym.product.service.IProductService;

import java.awt.print.Pageable;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;


    @Override
    public Page<Product> findAllAndSearch(String name, String description, String manufacture, Pageable pageable) {
        return this.productRepository.findAllByNameProductContainingAndDescriptionContainingAndManufactureContaining(
                name, description, manufacture, pageable);
    }

    @Override
    public void save(Product product) {
        this.productRepository.save(product);
    }

    @Override
    public void deleteById(int id) {
        this.productRepository.deleteById(id);
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id).orElse(null);
    }
}
