package com.example.banksimulator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/test")
    public String getTest() {
        return "test";
    }
}
