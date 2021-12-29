package com.foracademy.dao.Secretary;

import com.foracademy.models.Class;
import com.foracademy.models.Secretary;
import com.foracademy.models.Speciality;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SecretaryFactory {
    private SecretaryFactory() { }

    public static Secretary create(ResultSet resultSet) throws SQLException {
        Secretary secretary = new Secretary();
        secretary.setId(resultSet.getInt("idSecretary"));
        secretary.setDateOfEntryToFactory(resultSet.getDate("dateOfEntryToFactory"));
        return secretary;
    }


    }
