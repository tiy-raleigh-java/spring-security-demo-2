package com.theironyard.springsecuritydemo.controller;

import com.theironyard.springsecuritydemo.entity.User;
import com.theironyard.springsecuritydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin(origins = "*")
@Controller
public class MyController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/secret")
    public String showSecret(){
        return "secret";
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user){
        userRepository.save(user);

        return "redirect:/login";
    }
}

