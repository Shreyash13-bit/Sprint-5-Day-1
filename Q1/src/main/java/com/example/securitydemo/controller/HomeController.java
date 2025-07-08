
package com.example.securitydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Welcome! <a href='/login'>Login</a>";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "Logged In Successfully!";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin() {
        return "Welcome Admin!";
    }

    @GetMapping("/user")
    @ResponseBody
    public String user() {
        return "Welcome User!";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
