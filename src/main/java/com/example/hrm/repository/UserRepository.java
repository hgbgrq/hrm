package com.example.hrm.repository;
import com.example.hrm.entity.QUser;
import com.example.hrm.entity.User;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.hrm.entity.QOrganization.organization;
import static com.example.hrm.entity.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @Autowired
    private final JPAQueryFactory queryFactory;

    public List<User> selectUsers(){
        return queryFactory
                .select(
                        Projections.fields(User.class,
                                user.userId
                                , user.userFirstName
                                , user.userLastName
                                , user.positionCode
                                , user.organization.organizationName
                                , user.statusCode
                        )
                )
                .from(user)
                .leftJoin(user.organization,organization)
                .fetch();
    }

}
