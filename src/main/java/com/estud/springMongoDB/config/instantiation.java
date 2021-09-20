package com.estud.springMongoDB.config;

import com.estud.springMongoDB.entity.User;
import com.estud.springMongoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User(null,"Maria lala", "lala@g.com");
        User alex = new User(null,"Alez lele", "elele@g.com");
        User lola = new User(null,"Jota lala", "jota@g.com");

        userRepository.saveAll(Arrays.asList(maria,alex,lola));

    }
}
