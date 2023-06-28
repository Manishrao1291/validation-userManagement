package com.example.validation.repo;

import com.example.validation.configuration.BeanFactory;
import com.example.validation.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {


    @Autowired
    BeanFactory beanFactory;


    public List<User> getAllUsers() {
        return beanFactory.getList();
    }





}
