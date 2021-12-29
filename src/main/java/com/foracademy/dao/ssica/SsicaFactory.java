package com.foracademy.dao.ssica;


import com.foracademy.models.Class;
import com.foracademy.models.Ssica;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SsicaFactory {
    private SsicaFactory() { }

    public static Ssica create(ResultSet resultSet) throws SQLException {
        Ssica ssica = new Ssica();
        ssica.setId(resultSet.getInt("idSsica"));
        ssica.setBrand(resultSet.getString("brand"));
        return ssica;
    }
    }


