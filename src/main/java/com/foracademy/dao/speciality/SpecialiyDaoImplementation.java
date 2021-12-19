package com.foracademy.dao.speciality;
import com.foracademy.dao.Database;
import com.foracademy.models.Speciality;
import javafx.scene.chart.PieChart;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SpecialiyDaoImplementation implements SpecialityDao{
    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Speciality> findAll() {
        return null;
    }

    @Override
    public Speciality findById(int id) {
        return null;
    }

    @Override
    public int insert(Speciality speciality) {
        try {

            Database connection = new Database();
            connection.connect();
            if (speciality.getId()!=0){
                var sql1 = "UPDATE speciality set description=? and name=? where idSpeciality=?";
                PreparedStatement statement = connection.connect().prepareStatement(sql1);
                statement.setString(1, speciality.getDescription());
                statement.setString(2,speciality.getName());
                statement.setInt(3,speciality.getId());
                statement.execute();
            }else {
                var sql2 = " INSERT INTO speciality ( name , description ) VALUES ( ? , ?) ";
                PreparedStatement statement = connection.connect().prepareStatement(sql2);
                statement.setString(1,speciality.getName());
                statement.setString(2,speciality.getDescription());
                statement.execute();
            }

            System.out.println(speciality.getName()+" "+ " and "+" "+speciality.getDescription()+" add to database");

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("unable to save ");
        }
        return 1;
    }

    @Override
    public int update(Speciality speciality) {
        return 0;
    }
}
