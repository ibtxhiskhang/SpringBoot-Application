package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")


public class SimpleController {
    @GetMapping("/Math")
    public Integer ourFunction() {
        return 5+6;
    }
    @GetMapping ("/contactMe")
    public String contactMe() {
        return "No contact info!";
    }
}