package com.example.hrm.login.controller;

import com.example.hrm.login.dto.LoginDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestBody LoginDto loginDto) {

    }

    @GetMapping("/admin")
    public void admin(){
    }

    @GetMapping("/all")
    public void all(){ }
}
