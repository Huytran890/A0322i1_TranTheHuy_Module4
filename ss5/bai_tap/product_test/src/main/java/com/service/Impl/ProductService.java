package com.service.Impl;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> listAll() {
        return this.productRepository.listAll();
    }

    @Override
    public void create(Product product) {
        this.productRepository.create(product);
    }

    @Override
    public Product findById(int id) {
        return this.productRepository.findById(id);
    }

    @Override
    public void delete(Product product) {
        this.productRepository.delete(product);
    }

    @Override
    public void edit(int id, Product product) {
        this.productRepository.edit(id,product);
    }

    @Override
    public List<Product> search(String name) {
        return this.productRepository.search(name);
    }
}
