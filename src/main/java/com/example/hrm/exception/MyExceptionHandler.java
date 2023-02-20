package com.example.hrm.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler({MyException.class})
    protected ResponseEntity<ErrorDto> handleMyException(MyException e) {
        ErrorDto errorDto = new ErrorDto();
        errorDto.setStatusCode(e.getCustomExceptionCode().getStatus());
        errorDto.setMessage(e.getCustomExceptionCode().getMessage());
        return new ResponseEntity(errorDto, HttpStatusCode.valueOf(errorDto.getStatusCode()));
    }
}
