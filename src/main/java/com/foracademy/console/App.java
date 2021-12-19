package com.foracademy.console;
import com.foracademy.dao.speciality.SpecialiyDaoImplementation;
import com.foracademy.models.Speciality;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class App {

    public static void main(String[] args) {
       // System.out.println("HELLO FROM CONSOLE APP");
        Speciality speciality1 = new Speciality(1,"PHISIQUE","it is a good specility");

        SpecialiyDaoImplementation example = new SpecialiyDaoImplementation();
         example.insert(speciality1);
    }

}
