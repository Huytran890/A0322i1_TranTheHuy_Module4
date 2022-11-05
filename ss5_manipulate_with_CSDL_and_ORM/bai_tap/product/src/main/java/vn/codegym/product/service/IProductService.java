package vn.codegym.product.service;

import org.springframework.data.domain.Page;
import vn.codegym.product.model.Product;

import java.awt.print.Pageable;

public interface IProductService {
    Page<Product> findAllAndSearch(String name, String description, String manufacture, Pageable pageable);

    void save(Product product);

    void deleteById(int id);

    Product findById(int id);
}
