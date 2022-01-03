package com.foracademy.dao.factory;

import com.foracademy.models.Factory;

import java.sql.ResultSet;
import java.sql.SQLException;

public class factoryFactory {
    private  factoryFactory(){}

    public static Factory create(ResultSet resultSet)throws SQLException{
        Factory factory = new Factory();

        factory.setId(resultSet.getInt("idFactory"));
        factory.setName(resultSet.getString("name"));
        factory.setAddress(resultSet.getInt("idAddress"));
        return factory;

    }
}
