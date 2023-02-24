package com.example.hrm.user;

import com.example.hrm.user.repository.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserTest {


    @Autowired
    private TestRepository testRepository;

    @Test
    void getTest(){
        testRepository.getUser();

    }


}
