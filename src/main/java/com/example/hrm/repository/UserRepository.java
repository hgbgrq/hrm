package com.example.hrm.repository;
import com.example.hrm.entity.QUser;
import com.example.hrm.entity.User;
import com.example.hrm.model.user.dto.UserDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.hrm.entity.QCommonCode.commonCode;
import static com.example.hrm.entity.QOrganization.organization;
import static com.example.hrm.entity.QUser.user;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @Autowired
    private final JPAQueryFactory queryFactory;

    public List<UserDto> selectUsers(){
        return queryFactory
                .select(
                        Projections.fields(UserDto.class,
                                user.userId
                                , user.userFirstName
                                , user.userLastName
                                , user.organization.organizationName
                                , user.phoneNumber
                                , user.commonCodePosition.commonCodeName.as("positionName")
                                , user.commonCodeStatus.commonCodeName.as("statusName")
                        )
                )
                .from(user)
                .leftJoin(user.organization)
                .leftJoin(user.commonCodePosition)
                .leftJoin(user.commonCodeStatus)
                .leftJoin(user.vacationList)
                .fetch();
    }

}
