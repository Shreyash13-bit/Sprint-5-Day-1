package com.example.ldapauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {
    @GetMapping("/user")
    public String userInfo(Principal principal) {
        return "Authenticated as: " + principal.getName();
    }
}