package com.foracademy.dao.Class;

import com.foracademy.models.Class;


import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassFactory {
    private ClassFactory() { }

    public static Class create(ResultSet resultSet) throws SQLException {
        Class aClass = new Class();
        aClass.setId(resultSet.getInt("idClass"));
        aClass.setName(resultSet.getString("name"));
        aClass.setTrainer(resultSet.getInt("idTrainer"));
        aClass.setPromotion(resultSet.getInt("idPromotion"));
        aClass.setStartDay(resultSet.getDate("startDay"));
        aClass.setEndDay(resultSet.getDate("endDay"));
        return aClass;
    }
}
