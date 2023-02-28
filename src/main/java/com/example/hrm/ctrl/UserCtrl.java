package com.example.hrm.ctrl;

import com.example.hrm.model.user.res.UserResList;
import com.example.hrm.svc.UserSvc;
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
    public ResponseEntity<UserResList> getUserList(){
        UserResList result = userSvc.selectUser();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
