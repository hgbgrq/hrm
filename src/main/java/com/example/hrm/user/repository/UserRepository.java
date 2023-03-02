package com.example.hrm.user.repository;
import com.example.hrm.user.model.dto.UserDto;
import com.example.hrm.user.model.req.UserReq;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.hrm.entity.QUser.user;
import static com.example.hrm.entity.QUserVacation.userVacation;

@Repository
@RequiredArgsConstructor
public class UserRepository {

    @Autowired
    private final JPAQueryFactory queryFactory;

    public List<UserDto> selectUsers(UserReq userReq){
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
                                , userVacation.userVacationRemainCount.as("remainVacation")
                        )
                )
                .from(user)
                .leftJoin(user.organization)
                .leftJoin(user.commonCodePosition)
                .leftJoin(user.commonCodeStatus)
                .leftJoin(userVacation).on(userVacation.userId.eq(user.userId)
                        , userVacation.useYn.eq("Y")
                        , userVacation.userVacationCode.eq("NORMAL"))
                .fetch();
    }



}
