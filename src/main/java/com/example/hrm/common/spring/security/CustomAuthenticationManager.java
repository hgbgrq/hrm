package com.example.hrm.common.spring.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class CustomAuthenticationManager implements AuthenticationManager {

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        log.info("################################# CustomAuthenticationManager");
        UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;

        // TODO: DB 없음, 유저정보 하드코딩
        List<SimpleGrantedAuthority> roleList = new ArrayList<>();
        switch (token.getName()){
            case "user":
                roleList.add(new SimpleGrantedAuthority("ROLE_USER"));
                break;
            case "admin":
                roleList.add(new SimpleGrantedAuthority("ROLE_USER"));
                roleList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
                break;
            default:
                log.info("잘못된 사용자 정보 userId : {}", token.getName());
                throw new BadCredentialsException("잘못된 사용자 정보");
        }

        User user = new User(token.getName(), token.getCredentials().toString(), roleList);

        log.info("login success : {}", token.getName());
        return UsernamePasswordAuthenticationToken.authenticated(user, token.getCredentials(), roleList);
    }
}
