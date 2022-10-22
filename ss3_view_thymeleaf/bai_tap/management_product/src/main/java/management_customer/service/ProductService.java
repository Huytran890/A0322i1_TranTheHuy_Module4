package management_customer.service;

import management_customer.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> productAll();

    void create(Product product);

    Product findById(int id);

    void edit(int id, Product product);

    void delete(int id);

    List<Product> search(String name);
}
