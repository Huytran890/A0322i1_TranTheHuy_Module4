package com.repository.Impl;

@Repository
public class ProductRepository implements IProductRepository {

    @Override
    public List<Product> listAll() {
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
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                "select p from Product p where p.id = :id", Product.class
        );
        typedQuery.setParameter("id",id);

        return typedQuery.getSingleResult();
    }

    @Override
    public void delete(Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        BaseRepository.entityManager.remove(product);
        entityTransaction.commit();
    }

    @Override
    public void edit(int id, Product product) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        findById(id);
        BaseRepository.entityManager.merge(product);
        entityTransaction.commit();
    }

    @Override
    public List<Product> search(String name) {
        TypedQuery<Product> typedQuery = BaseRepository.entityManager.createQuery(
                "select p from Product p where name like :name", Product.class
        );
        typedQuery.setParameter("name", "%"+name+"%");

        return typedQuery.getResultList();
    }
}
