package com.example.hrm.model.user.res;

import lombok.Data;

import java.util.List;

@Data
public class UserResList {

    Integer totalCount;

    List<UserRes> list;

}
