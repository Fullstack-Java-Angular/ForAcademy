package com.foracademy.dao;

import java.sql.SQLException;
import java.util.List;

public interface Dao<T> {
    int delete(int id) throws SQLException;
    List<T> findAll();
    T findById(int id);
    int insert(T businessObject);
    int update(T businessObject);
}
