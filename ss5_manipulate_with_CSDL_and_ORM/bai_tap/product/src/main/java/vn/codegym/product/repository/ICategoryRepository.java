package vn.codegym.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.codegym.product.model.Category;

public interface ICategoryRepository extends JpaRepository<Category,Integer> {
}
