package com.vivek.WebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user")
    public String getUser(){
        return "User not found!";
    }

    @RestController
    public static class HomeController {
        @RequestMapping("/")
        public String sendServerHealth(){
            return "Server is healthy!";
        }

        @RequestMapping("/auth")
        public String auth(){
            return "Auth!";
        }
    }
}
