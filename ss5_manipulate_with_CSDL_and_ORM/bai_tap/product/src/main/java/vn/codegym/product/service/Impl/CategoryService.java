package vn.codegym.product.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.product.model.Category;
import vn.codegym.product.repository.ICategoryRepository;
import vn.codegym.product.service.ICategoryService;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }
}
