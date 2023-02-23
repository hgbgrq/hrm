package com.example.hrm.ExceptionTest;

import com.example.hrm.common.dto.ComResponse;
import com.example.hrm.exception.CustomExceptionCode;
import com.example.hrm.exception.MyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/exception")
public class TestController {

    @GetMapping("/hi")
    public ResponseEntity<Map> getException(@RequestParam Integer number) {

        ComResponse comResponse = new ComResponse();
        HashMap<String, String> map = new HashMap<>();

        if(number == 1) {
            System.out.println("성공");
            map.put("number", "1");
            comResponse.setStatus(CustomExceptionCode.SUCCESS.getStatus());
            comResponse.setMessage(CustomExceptionCode.SUCCESS.getMessage());
            comResponse.setBody(map);
        } else if(number == 0) {
            throw new MyException(CustomExceptionCode.ZERO_FAIL);
        } else if(number == 2) {
            throw new MyException(CustomExceptionCode.TWO_FAIL);
        } else if(number == 3) {
            throw new MyException(CustomExceptionCode.THREE_FAIL);
        }

        return new ResponseEntity(comResponse, HttpStatus.OK);
    }
}

