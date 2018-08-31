package com.sambasoft.angularprojectone.Controllers;

import com.sambasoft.angularprojectone.Entity.User;
import com.sambasoft.angularprojectone.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders= "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;



    @GetMapping("/users")
    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public boolean deleteUser(@PathVariable Long id){
        userRepository.deleteById(id);
       return true;
    }

    @PutMapping("/user")
    public User editUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }
}
