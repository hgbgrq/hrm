package com.example.hrm.user.ctrl;

import com.example.hrm.user.model.req.UserReq;
import com.example.hrm.user.model.res.UserResList;
import com.example.hrm.user.svc.UserSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserCtrl {

    @Autowired
    private UserSvc userSvc;

    @GetMapping
    public ResponseEntity<UserResList> getUserList(UserReq userReq){
        UserResList result = userSvc.selectUser(userReq);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
