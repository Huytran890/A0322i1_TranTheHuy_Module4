package com.codegym.repository.Impl;

import com.codegym.model.AppMusic;
import com.codegym.repository.IAppMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AppMusicRepository implements IAppMusicRepository {


    @Override
    public List<AppMusic> listAll() {
        TypedQuery<AppMusic> listMusic = BaseRepository.entityManager.createQuery(
                "select a from AppMusic as a", AppMusic.class);
        return listMusic.getResultList();
    }

    @Override
    public AppMusic findById(int id) {
        TypedQuery<AppMusic> typedQuery = BaseRepository.entityManager.createQuery(
                "select a from AppMusic as a where a.id = :id", AppMusic.class
        );
        typedQuery.setParameter("id", id);

        return typedQuery.getSingleResult();
    }

    @Override
    public void create(AppMusic appMusic) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        BaseRepository.entityManager.persist(appMusic);
        entityTransaction.commit();
    }

    @Override
    public void edit(int id, AppMusic appMusic) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        findById(id);
        BaseRepository.entityManager.merge(appMusic);
        entityTransaction.commit();

    }

    @Override
    public void delete(AppMusic appMusic) {
        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();

        entityTransaction.begin();
        BaseRepository.entityManager.remove(appMusic);
        entityTransaction.commit();
    }
}
