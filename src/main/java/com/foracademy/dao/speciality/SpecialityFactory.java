package com.foracademy.dao.speciality;

import com.foracademy.models.Speciality;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SpecialityFactory {
    private SpecialityFactory() { }

    public static Speciality create(ResultSet resultSet) throws SQLException {
        Speciality speciality = new Speciality();
        speciality.setId(resultSet.getInt("idSpeciality"));
        speciality.setName(resultSet.getString("name"));
        speciality.setDescription(resultSet.getString("description"));
        return speciality;
    }
}
