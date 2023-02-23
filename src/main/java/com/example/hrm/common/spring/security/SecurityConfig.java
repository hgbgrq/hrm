package com.example.hrm.common.spring.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@Configuration
@EnableWebSecurity // Spring Security 필터가 스프링 필터체인에 등록된다.
public class SecurityConfig{

    @Autowired
    private AuthenticationProviderImpl authenticationProvider;

    @Value("${spring.security.staticContents-url-patterns}")
    private String[] staticContentsPatterns;

    @Value("${spring.security.permitAll-url-patterns}")
    private String[] permitAllPatterns;

    @Bean // 해당 메소드의 리턴되는 오브젝트를 IoC로 등록 해준다.
    public BCryptPasswordEncoder encodePwd(){
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public WebSecurityCustomizer webSecurityCustomizer() {
//        // Security 필터를 적용 하지 않을(허용) 주소( 기본 스웨거 주소 등 )
//        log.info("static contents : {}", this.staticContentsPatterns);
//        return (web) -> web.ignoring().requestMatchers(staticContentsPatterns);
//    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        // 모든 권한 허용
        http.authorizeHttpRequests().requestMatchers(this.staticContentsPatterns).permitAll();
        http.authorizeHttpRequests().requestMatchers(this.permitAllPatterns).permitAll();

        http
                .formLogin()
                .loginPage("/error/401") // 로그인 form은 보통 front-end 에서 사용하기 때문에 이러한 url을 매핑하였음.
                .loginProcessingUrl("/login") // UsernamePasswordAuthenticationFilter가 낚아 챌 api
                .usernameParameter("userId")
                .passwordParameter("password")
                .and()
                .exceptionHandling();

        // 권한 설정
        http.authorizeHttpRequests().requestMatchers("GET", "/admin").hasRole("ADMIN");
        http.authorizeHttpRequests().requestMatchers("GET", "/all").hasAnyRole("USER","ADMIN");

        http.authenticationProvider(authenticationProvider);
        return http.build();
    }
}