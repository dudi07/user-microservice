package com.user.service.service.impl;

import com.user.service.dao.UserDao;
import com.user.service.entity.User;
import com.user.service.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    User user = null;
    public User getUserById(String id){
        try{
            log.info("Entered getUserById method with id {}", id);
            user = userDao.findById(id);
        }catch(Exception exception){
            log.error("Exception occurred", exception);
            throw  exception;
        }
        return user;
    }

    public User saveUser(User user){
        try{
            log.info("Entered saveUser method with user {}", user);
            userDao.saveUser(user);
        }catch(Exception exception){
            log.error("Exception occurred", exception);
            throw  exception;
        }
        return user;
    }
}
