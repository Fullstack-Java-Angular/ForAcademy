package com.foracademy.console;
//import com.foracademy.dao.Dao;

import java.sql.Timestamp;
import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.Promotion.PromotionDao;
import com.foracademy.models.Promotion;
import javafx.print.PageOrientation;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {


    public static void main(String[] args) {

       PromotionDao promotionDao = DaoFactory.getInstance().getPromotionDao();

        Date date = new Date();
        Timestamp ts =new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Promotion p = new Promotion();
        p.setName("ksdksd");
        p.setYear(2012);
        p.setStartDate(ts);
        p.setEndDate(ts);
        try {
           promotionDao.insert(p);
       }catch (SQLException e) {
           e.printStackTrace();
       }

}
}