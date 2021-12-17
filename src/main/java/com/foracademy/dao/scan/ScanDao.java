package com.foracademy.dao.scan;

import com.foracademy.models.Scan;

import java.util.List;

public interface ScanDao {
    public int delete(int id);
    public List<Scan> findAll();
    public Scan findById(int id);
    public int insert(Scan scan);
    public int update(Scan scan);
}
