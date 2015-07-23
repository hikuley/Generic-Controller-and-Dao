package com.ibrahimkuley.util.genericDao;

/**
 * Created by hikuley on 25.05.2015.
 */
public interface IControllerDao<T extends BaseEntity> {

    T create(T t);

    void delete(Long id, Class aClass);

    T update(T t);

    T findById(Long id, Class aClass);
}
