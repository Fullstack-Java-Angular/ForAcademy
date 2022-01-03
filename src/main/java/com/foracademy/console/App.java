package com.foracademy.console;
//import com.foracademy.dao.Dao;

import java.sql.Timestamp;
import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.Promotion.PromotionDao;
import com.foracademy.dao.speciality.SpecialiyDao;
import com.foracademy.models.Promotion;
import com.foracademy.models.Speciality;
import javafx.print.PageOrientation;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {


    public static void main(String[] args) {

       //PromotionDao promotionDao = DaoFactory.getInstance().getPromotionDao();
        SpecialiyDao specialiyDao = DaoFactory.getInstance().getSpeciality();

       /* Speciality s = new Speciality();
        s.setName("phisique");
        s.setDescription("science part");*/


        try {
            System.out.println(specialiyDao.findById(2));
       }catch (SQLException e) {
           e.printStackTrace();
       }

}
}