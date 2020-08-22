package io.fulchr3356.upkeepassistant.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public abstract class AbstractJpaDAO <TypeOfEntity> {

    private Class<TypeOfEntity> entity;

    public final void setClass(Class<TypeOfEntity> entityToSet){
        this.entity = entityToSet;
    }

    @PersistenceContext
    private EntityManager entityManager;

    public TypeOfEntity findById(Integer id){
    return entityManager.find(entity,id);
    }

    public void create(TypeOfEntity entity){
        entityManager.persist( entity );
    }


    public TypeOfEntity update(TypeOfEntity entity ){
        return entityManager.merge( entity );
    }

}
