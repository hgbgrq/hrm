package com.example.hrm.test;

import com.example.hrm.exception.MyException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

    @Test
    void getException() {

        int i = 0;

        if(i == 1) {
            System.out.println("성공");
        } else {
        }
    }
}