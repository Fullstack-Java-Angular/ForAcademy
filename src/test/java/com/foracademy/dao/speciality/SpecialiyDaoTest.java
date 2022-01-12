package com.foracademy.dao.speciality;

import com.foracademy.dao.DaoUtilities;
import com.foracademy.models.Speciality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpecialiyDaoTest {

    @Test
    void delete() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        // given
        System.out.println("Running testDelete...");
        Speciality MSepciality = new Speciality();
        try {
        Assertions.assertTrue(specialiy.delete(5)>0);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        MSepciality.setId(5);
        Assertions.assertNull(MSepciality);
    }

    @Test
    void findAll() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        System.out.println("Running testList...");
        try {
           Assertions.assertFalse(specialiy.findAll().isEmpty());
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void findById() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        System.out.println("Running testGet...");
        Speciality MSepciality = new Speciality();
        try {
            MSepciality =  specialiy.findById(5);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        assertEquals("frensh",MSepciality.getName()   );
    }

    @Test
    void insert() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        // given
        System.out.println("Running testSave...");
        Speciality MSepciality = new Speciality();
        MSepciality.setName("arabic");
        MSepciality.setDescription("arabic is good matier for arabic people");
        try {
            specialiy.insert(MSepciality);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals("arabic",MSepciality.getName());
    }

    @Test
    void update() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        // given
        System.out.println("Running testUpdate...");
        Speciality MSepciality = new Speciality();
        MSepciality.setId(5);
        MSepciality.setName("frensh");
        MSepciality.setDescription("zbcbcbcbcb");

        try {
            specialiy.update(MSepciality);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        assertEquals("frensh",MSepciality.getName());

    }
}