package com.user.service.dao;


import com.user.service.entity.User;

public interface UserDao {
    void saveUser(User user);
    User findById(String id);
}