package com.sambasoft.angularprojectone;

import com.sambasoft.angularprojectone.Entity.User;
import com.sambasoft.angularprojectone.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularprojectoneApplication implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    public static void main(String[] args) {
        SpringApplication.run(AngularprojectoneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.save(new User("one","one"));
        userRepository.save(new User("two","two"));
        userRepository.save(new User("three","three"));
    }
}
