package com.example.jpaauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AuthController {

    @GetMapping("/user")
    public String user(Principal principal) {
        return "Welcome " + principal.getName();
    }
}