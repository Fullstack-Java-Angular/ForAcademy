package com.foracademy.dao.speciality;

import com.foracademy.models.Speciality;

import java.util.List;

public interface SpecialityDao {
    public int delete(int id);
    public List<Speciality> findAll();
    public Speciality findById(int id);
    public int insert(Speciality speciality);
    public int update(Speciality speciality);
}
