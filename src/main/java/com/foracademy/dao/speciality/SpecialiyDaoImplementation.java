package com.foracademy.dao.speciality;
import com.foracademy.dao.Database;
import com.foracademy.models.Speciality;
import javafx.scene.chart.PieChart;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class SpecialiyDaoImplementation implements SpecialityDao{
    @Override
    public int delete(int id) {
        Database connection = new Database();
        String query = " DELETE FROM speciality WHERE idSpeciality=? ";
        try(PreparedStatement statement = connection.connect().prepareStatement(query)) {
            statement.setInt(1,id);
            statement.executeUpdate();

            System.out.println("the speciality has been  delete successfully");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("unable to delete ");
        }
        return 0;
    }

    @Override
    public List<Speciality> findAll() {
        Database connection = new Database();
        List<Speciality> AllSpeciality = new LinkedList<>();
        String query = "SELECT * FROM speciality";
        try(PreparedStatement statement = connection.connect().prepareStatement(query)) {
            ResultSet result = statement.executeQuery();
            while (result.next()){
                Speciality oneSpecialites = new Speciality(result.getInt("idSpeciality"),
                        result.getString( "name"),
                        result.getString("description"));
                AllSpeciality.add(oneSpecialites);
            }
        } catch (SQLException e){
            e.printStackTrace();
            System.out.println(" sorry we can not get all the speciality ");
        }
        return AllSpeciality;
    }

    @Override
    public Speciality findById(int id) {
        Database connection = new Database();
        String query = "SELECT * FROM speciality WHERE idSpeciality=? ";
        try( PreparedStatement statement = connection.connect().prepareStatement(query)) {
            statement.setInt(1,id);
            ResultSet result = statement.executeQuery();

           if (result.next()){
          Speciality oneSpeciality = new Speciality(result.getInt("idSpeciality"),
               result.getString( "name"),
               result.getString("description"));
          return oneSpeciality;
            }else {
                System.out.println("speciality not Found");
            }

        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("unable to save ");
        }
        return null;
    }

    @Override
    public int insert(Speciality speciality) {
        try {

            Database connection = new Database();
            String query = "UPDATE speciality SET description=? , name=? WHERE idSpeciality=?";
            if (speciality.getId()>0){

                PreparedStatement statement = connection.connect().prepareStatement(query);
                statement.setString(1, speciality.getDescription());
                statement.setString(2,speciality.getName());
                statement.setInt(3,speciality.getId());
                statement.executeUpdate();
            }else {

                String query1 = " INSERT INTO speciality ( name , description ) VALUES ( ? , ?) ";
                try ( PreparedStatement statement = connection.connect().prepareStatement(query1)) {
                    statement.setString(1,speciality.getName());
                    statement.setString(2,speciality.getDescription());
                    statement.executeUpdate();
                }catch (SQLException e){
                    e.printStackTrace();
                    System.out.println("unable to save ");
                }

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
