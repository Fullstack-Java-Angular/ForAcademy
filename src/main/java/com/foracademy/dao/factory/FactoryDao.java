package com.foracademy.dao.factory;

import com.foracademy.models.Factory;

import java.util.List;

public interface FactoryDao {
    public int delete(int id);
    public List<Factory> findAll();
    public Factory findById(int id);
    public int insert(Factory factory);
    public int update(Factory factory);

}
