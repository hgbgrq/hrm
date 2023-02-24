package com.example.hrm.login.controller;

import com.example.hrm.login.dto.LoginDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @PostMapping("/login")
    public void login(@RequestParam LoginDto loginDto) {
        log.info("userId : {}, pass : {}", loginDto.getUserId(), loginDto.getPassword());
    }

    @GetMapping("/admin")
    public void admin(){
        log.info("admin 입니다.");
    }

    @GetMapping("/all")
    public void all(){
        log.info("user 입니다.");
    }
}
