package com.foracademy.dao.Promotion;

import com.foracademy.models.Permission;
import com.foracademy.models.Promotion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionFactory {
    private PromotionFactory(){}

    public static Promotion create(ResultSet resultSet) throws SQLException {
      Promotion promotion = new Promotion();
      promotion.setId(resultSet.getInt("idPromotion"));
      promotion.setName(resultSet.getString("name"));
      promotion.setYear(resultSet.getInt("year"));
      promotion.setStartDate(resultSet.getTimestamp("startDate"));
      promotion.setEndDate(resultSet.getTimestamp("endDate"));

        return promotion;
    }
}
