package com.vivek.WebApp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServerHealthController {
    @RequestMapping("/api/v1")
    public String sendServerHealth() {
        return "Server is healthy!";
    }

    @RequestMapping("/")
    public String message() {
        return "Server is running!";
    }

}