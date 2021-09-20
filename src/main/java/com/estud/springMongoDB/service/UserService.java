package com.estud.springMongoDB.service;

import com.estud.springMongoDB.entity.User;
import com.estud.springMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){

        return repository.findAll();
    }
}
