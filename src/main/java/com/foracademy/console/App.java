package com.foracademy.console;
import com.foracademy.dao.Dao;
import com.foracademy.dao.speciality.SpecialityDao;
import com.foracademy.dao.speciality.SpecialiyDaoImplementation;
import com.foracademy.models.Speciality;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

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
    }

}