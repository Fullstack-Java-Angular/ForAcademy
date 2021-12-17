package com.foracademy.dao.Class;

import com.foracademy.models.Address;

import java.util.List;

public class ClassDaoImplementation implements ClassDao {
    /*
     * Queries Part
     */
    private static final String DELETE_ADDRESS = "";
    private static final String UPDATE_ADDRESS = "";

    /*
     * Code part
     */
    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(int id) {
        return null;
    }

    @Override
    public int insert(Address address) {
        return 0;
    }

    @Override
    public int update(Address address) {
        return 0;
    }
}
