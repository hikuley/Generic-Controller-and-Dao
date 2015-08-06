package com.ibrahimkuley.util.genericController;

import com.ibrahimkuley.util.genericDao.BaseEntity;
import com.ibrahimkuley.util.genericDao.IControllerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.GenericTypeResolver;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hikuley on 21.06.2015.
 */

public abstract class GenericController<T extends BaseEntity> implements IGenericController<T> {

    @Autowired
    private IControllerDao<T> genericDao;

    private Class<T> clazz;

    public GenericController() {
        this.clazz = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(), IGenericController.class);
    }

    @Override
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public Map<String, Object> create(@RequestBody T t) {
        genericDao.create(t);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        response.put("created", "created object");
        return response;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Map<String, Object> delete(@PathVariable("id") Long id) {
        genericDao.delete(id, clazz);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        response.put("deleted", "deleted object");
        return response;
    }


    @Override
    @ResponseBody
    @RequestMapping(method = RequestMethod.PUT)
    public Map<String, Object> update(@RequestBody T t) {
        genericDao.update(t);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        response.put("updated", "updated object");
        response.put("data", t);
        return response;
    }

    @Override
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Map<String, Object> findById(@PathVariable Long id) {
        T t = genericDao.findById(id, this.clazz);
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("success", true);
        response.put("readed", "readed object");
        response.put("data", t);
        return response;
    }
}