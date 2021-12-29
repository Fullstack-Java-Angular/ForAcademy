package com.foracademy.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {
    int delete(int id) throws SQLException;
    List<T> findAll() throws SQLException;
    T findById(int id) throws SQLException;
    int insert(T businessObject) throws IOException, SQLException;
    int update(T businessObject) throws SQLException;
}
