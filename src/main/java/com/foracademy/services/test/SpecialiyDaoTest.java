package com.foracademy.services.test;

import com.foracademy.dao.DaoUtilities;
import com.foracademy.dao.speciality.SpecialiyDao;
import com.foracademy.models.Speciality;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class SpecialiyDaoTest {

    @Test
    void ShouldDeleteSpeciality() {
        /*SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        System.out.println("Running testDeleting...");
        try {
            specialiy.delete(2);
        }catch (SQLException e) {
            e.printStackTrace();
        }*/

    }

    @Test
    void ShouldGetAllSpecialities() {
       // SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
    }

    @Test
    void ShouldGetOneSpecialityById() {
       /* SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        // given
        Integer id = 1;
        Speciality MSepciality = new Speciality();
        MSepciality.setId(1);
        try {
            specialiy.findById(1);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("id",MSepciality.getId());*/


    }

    @Test
    void shouldSaveIntoDB() {
        SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
        // given
        System.out.println("Running testSave...");
        Speciality MSepciality = new Speciality();
       MSepciality.setName("math");
        MSepciality.setDescription("math is good matier in world");
        try {
            specialiy.insert(MSepciality);
        }catch (SQLException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals("math",MSepciality.getName());



    }

  @Test
    void ShouldUpdateSpeciality() {
     /* SpecialiyDao specialiy = DaoUtilities.DaoFactory.getInstance().getSpecialityDao();
      System.out.println("Running testUpdate...");
      Speciality MSepciality = new Speciality();
      MSepciality.setId(2);
      MSepciality.setName("phisique");
      MSepciality.setDescription("math is nice matier in world");
      try {
          specialiy.update(MSepciality);
      }catch (SQLException e) {
          e.printStackTrace();
      }*/


    }
}