package com.example.demo.admin.controller;

import com.example.demo.admin.domain.User;
import com.example.demo.admin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> GetUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User GetUser(@PathVariable Integer id){
        return userRepository.findById(id).orElse(null);
    }

    @PostMapping("/")
    public User PostUser(@RequestBody User user){
        return userRepository.save(user);
    }
    @PutMapping("/")
    public User PutUser(@RequestBody User user){
        User oldUser = userRepository.findById(user.getId()).orElse(null);
        oldUser.setName(user.getName());
        oldUser.setEmail(user.getEmail());
        oldUser.setPassword(user.getPassword());
        return userRepository.save(oldUser);
    }

    @DeleteMapping("/{id}")
    public Integer DeleteUser(@PathVariable Integer id){
        userRepository.deleteById(id);
        return id;
    }

    @GetMapping("/hello")
    public String test() {
        return "Hello, world!";
    }
}
