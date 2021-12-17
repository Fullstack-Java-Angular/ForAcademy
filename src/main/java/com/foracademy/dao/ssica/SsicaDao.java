package com.foracademy.dao.ssica;

import com.foracademy.models.Ssica;

import java.util.List;

public interface SsicaDao {
    public int delete(int id);
    public List<Ssica> findAll();
    public Ssica findById(int id);
    public int insert(Ssica ssica);
    public int update(Ssica ssica);
}
