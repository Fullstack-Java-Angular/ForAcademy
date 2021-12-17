package com.foracademy.dao.user;

import com.foracademy.models.User;

import java.util.List;

public interface UserDao {
    public int delete(int id);
    public List<User> findAll();
    public User findById(int id);
    public int insert(User user);
    public int update(User user);
}
