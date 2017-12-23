package com.munna.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("/path")
    public String getAll(){
        return "hi iam from Springboot application";
    }
}
