package com.example.hrm.user.svc;

import com.example.hrm.user.model.dto.UserDto;
import com.example.hrm.user.model.req.UserReq;
import com.example.hrm.user.model.res.UserRes;
import com.example.hrm.user.model.res.UserResList;
import com.example.hrm.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserSvc {

    @Autowired
    private UserRepository userRepository;

    public UserResList selectUser(UserReq userReq){
        List<UserDto> userList = userRepository.selectUsers(userReq);
        List<UserRes> list = new ArrayList<>();
        UserResList result = new UserResList();

        for(UserDto dto : userList){
            UserRes userRes = new UserRes();
            userRes.setUserId(dto.getUserId());
            userRes.setUserFirstName(dto.getUserFirstName());
            userRes.setUserLastName(dto.getUserLastName());
            userRes.setOrgName(dto.getOrganizationName());
            userRes.setPositionName(dto.getPositionName());
            userRes.setStatusName(dto.getStatusName());
            userRes.setRemainVacation(dto.getRemainVacation());
            list.add(userRes);
        }
        result.setList(list);

        return result;
    }


}
