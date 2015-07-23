package com.ibrahimkuley.util.genericDao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hikuley on 06.07.2015.
 */
public class ControllerDao<T extends BaseEntity> implements IControllerDao<T> {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional
    public T create(T t) {
        this.getSession().save(t);
        return t;
    }

    @Override
    @Transactional
    public void delete(Long id, Class aClass) {
        T t = (T) getSession().get(aClass, id);
        this.getSession().delete(t);
    }

    @Override
    @Transactional
    public T update(T t) {
        this.getSession().update(t);
        return null;
    }

    @Override
    @Transactional
    public T findById(Long id, Class aClass) {
        T t = (T) getSession().get(aClass, id);
        return t;
    }

}
