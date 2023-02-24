package com.example.hrm.user.repository;

import com.example.hrm.entity.QUser;
import com.example.hrm.entity.User;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TestRepository {

    @Autowired
    private JPAQueryFactory jPAQueryFactory;

    public List<User> getUser(){
        return jPAQueryFactory.selectFrom(QUser.user).fetch();
    }
}
