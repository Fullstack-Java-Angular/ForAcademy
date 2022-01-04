package com.foracademy.services.test;

import com.foracademy.dao.Class.ClassDao;
import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Class;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ClassDaoTest {

    @Test
    void delete() {
        ClassDao classDao = (ClassDao) DaoUtilities.DaoFactory.getInstance().getClassDao();
        System.out.println("Running testDelete...");
        Class aClass = new  Class();
        try {
            Assertions.assertTrue(classDao.delete(2)>0);
        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    void findAll() {
        ClassDao classDao = (ClassDao) DaoUtilities.DaoFactory.getInstance().getClassDao();
        System.out.println("Running testList...");
        try {
            Assertions.assertFalse(classDao.findAll().isEmpty());
        }catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Test
    void findById() {
        ClassDao classDao = (ClassDao) DaoUtilities.DaoFactory.getInstance().getClassDao();
        System.out.println("Running testGet...");
        Class aClass = new  Class();
        try {
            aClass =  classDao.findById(3);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals("doha",aClass.getName());
    }

    @Test
    void insert() {
        ClassDao classDao = (ClassDao) DaoUtilities.DaoFactory.getInstance().getClassDao();
        Class aClass = new  Class();
        aClass.setName("doha");
        aClass.setTrainer(1);
        aClass.setPromotion(1);
        aClass.setStartDay(new Date(2020));
        aClass.setEndDay(new Date(2121));
        try {
            classDao.insert(aClass);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals("doha", aClass.getName());

    }

    @Test
    void update() {
        ClassDao classDao = (ClassDao) DaoUtilities.DaoFactory.getInstance().getClassDao();
        Class aClass = new  Class();
        aClass.setId(1);
        aClass.setName("wrvrs");
        aClass.setTrainer(1);
        aClass.setPromotion(1);
        aClass.setStartDay(new Date(2020));
        aClass.setEndDay(new Date(2121));
        try {
            classDao.update(aClass);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals("wrvrs", aClass.getName());
    }
}