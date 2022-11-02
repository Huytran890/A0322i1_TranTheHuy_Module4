package com.repository.Impl;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> productAll() {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                "select p from Product p", Product.class
        );

        return typedQuery.getResultList();
    }

    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        BaseRepository.entityManager.persist(product);
        entityTransaction.commit();
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
