package com.example.hrm.common.spring.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class LoginRequestBodyParseFilter extends OncePerRequestFilter {

    private String loginPattern;

    public LoginRequestBodyParseFilter(String loginPattern) {
        this.loginPattern = loginPattern;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("request url : {}", request.getRequestURL());

//        if(request.getServletPath().startsWith(loginPattern)){
//            filterChain.doFilter(request, response);
//        }
        filterChain.doFilter(request, response);
    }
}
