package com.example.oauth2tutorial;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String helloWorld(){
        return "Лабораторная №2 авторизация google oauth";
    }

    @GetMapping("/restricted")
    public String restricted(){
        return "Авторизация прошла успешно";
    }
}
