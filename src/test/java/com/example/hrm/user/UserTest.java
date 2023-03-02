package com.example.hrm.user;


import com.example.hrm.user.svc.UserSvc;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class UserTest {

    @Autowired
    private UserSvc userSvc;

    @Test
    void getUserList(){

    }

}
