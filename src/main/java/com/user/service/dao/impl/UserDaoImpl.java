package com.user.service.dao.impl;

import com.user.service.dao.UserDao;
import com.user.service.entity.User;
import com.user.service.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Slf4j
@AllArgsConstructor
public class UserDaoImpl implements UserDao {
    private final UserRepository userRepository;

    public void saveUser(User user){
        try{
            userRepository.save(user);
        } catch (HibernateException exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }catch (Exception exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }
    }
    public User findById(String id){
        User user = null;
        try{
            if(Objects.nonNull(userRepository.findById(id)))
                user = userRepository.findById(id).get();
        } catch (HibernateException exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }catch (Exception exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }
        return user;
    }
    public List<User> findAllUser(){
        List<User>users = new ArrayList<>();
        try{
            if(Objects.nonNull(userRepository.findAll()))
                users = userRepository.findAll();
        } catch (HibernateException exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }catch (Exception exception){
            log.error("Exception occurred ", exception);
            throw exception;
        }
        return users;
    }
}
