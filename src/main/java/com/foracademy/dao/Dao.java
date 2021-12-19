package com.foracademy.dao;

import java.util.List;

public interface Dao<T> {
    int delete(int id);
    List<T> findAll();
    T findById(int id);
    int insert(T businessObject);
    int update(T businessObject);
}
