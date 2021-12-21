package com.foracademy.console;
import com.foracademy.dao.Dao;
import com.foracademy.dao.speciality.SpecialityDao;
import com.foracademy.dao.speciality.SpecialiyDaoImplementation;
import com.foracademy.models.Speciality;

import com.foracademy.dao.DaoFactory;
import com.foracademy.dao.address.AddressDao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class App {

<<<<<<< HEAD
    public static void main(String[] args) {
       // System.out.println("HELLO FROM CONSOLE APP");
    SpecialityDao spc = new SpecialiyDaoImplementation();
      /* ******************************** for find by Id *********************************** */
      //     Speciality X=spc.findById(1);
      //   System.out.println(X);

        /* ******************************** for find All *********************************** */
         //  spc.findAll().forEach(System.out::println);

        /* ******************************** for insert or update *********************************** */
        // Speciality add = new Speciality(0,"math","it is smart specility" );
      //  spc.insert(add);

        /* ******************************** for delete *********************************** */
        //spc.delete(1);
=======
    public static void main(String[] args) throws IOException {
        System.out.println("HELLO FROM CONSOLE APP");
        AddressDao addressDao = DaoFactory.getInstance().getAddressDao();
        try {
            addressDao.delete(23);
        } catch (SQLException e) {
            e.printStackTrace();
        }
>>>>>>> e377ae69ecf372615d984909da459d64af5d8ea6
    }

}