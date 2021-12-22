package com.foracademy.console;
//import com.foracademy.dao.Dao;
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


    public static void main(String[] args) {
       // System.out.println("HELLO FROM CONSOLE APP");
    SpecialityDao spc = new SpecialiyDaoImplementation();

}
}