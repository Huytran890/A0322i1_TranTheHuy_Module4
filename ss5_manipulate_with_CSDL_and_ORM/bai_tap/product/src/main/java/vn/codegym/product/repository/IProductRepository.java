package vn.codegym.product.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.product.model.Product;

import java.awt.print.Pageable;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAllByNameProductContainingAndDescriptionContainingAndManufactureContaining(
            String name, String description, String manufacture, Pageable pageable);
}
