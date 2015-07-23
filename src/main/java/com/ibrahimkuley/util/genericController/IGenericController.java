package com.ibrahimkuley.util.genericController;

import com.ibrahimkuley.util.genericDao.BaseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by hikuley on 20.06.2015.
 */
public interface IGenericController<T extends BaseEntity> {


    Map<String, Object> create(T json);

    Map<String, Object> delete(Long id);

    Map<String, Object> update(T t);

    Map<String, Object> findById(Long id);

}
