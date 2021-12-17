package com.foracademy.dao.Class;

import com.foracademy.models.Address;

import java.util.List;

public interface ClassDao {
    public int delete(int id);
    public List<Address> findAll();
    public Address findById(int id);
    public int insert(Address address);
    public int update(Address address);
}
