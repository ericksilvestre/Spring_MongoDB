package com.estud.springMongoDB.controller;

import com.estud.springMongoDB.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){

        User maria = new User("1","Maria", "mari@gmail.com");
        User Alex = new User("2","alex", "Alex@gmail.com");
        User Jorge = new User("3","Jorge", "Jorge@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria,Alex,Jorge));

        return ResponseEntity.ok().body(list);
    }

}
