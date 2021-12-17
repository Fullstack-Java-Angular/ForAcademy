package com.foracademy.dao.Promotion;

import com.foracademy.models.Promotion;

import java.util.List;

public interface PromotionDao {

    public int delete(int id);
    public List<Promotion> findAll();
    public Promotion findById(int id);
    public int insert(Promotion promotion);
    public int update(Promotion promotion);
}
