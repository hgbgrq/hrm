package com.example.hrm.svc;

import com.example.hrm.entity.User;
import com.example.hrm.model.user.dto.UserDto;
import com.example.hrm.model.user.res.UserRes;
import com.example.hrm.model.user.res.UserResList;
import com.example.hrm.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class UserSvc {

    @Autowired
    private UserRepository userRepository;

    public UserResList selectUser(){
        List<UserDto> userList = userRepository.selectUsers();
        List<UserRes> list = new ArrayList<>();
        UserResList result = new UserResList();

        for(UserDto dto : userList){
            log.info(dto.toStringJson());
            UserRes userRes = new UserRes();
            userRes.setUserId(dto.getUserId());
            userRes.setUserFirstName(dto.getUserFirstName());
            userRes.setUserLastName(dto.getUserLastName());
            userRes.setOrgName(dto.getOrganizationName());
            userRes.setPositionName(dto.getPositionName());
            userRes.setStatusName(dto.getStatusName());
            list.add(userRes);
        }
        result.setList(list);

        return result;
    }


}
