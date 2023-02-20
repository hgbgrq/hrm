package com.example.hrm.exception;

public class MyException extends RuntimeException{

    private CustomExceptionCode customExceptionCode;

    public MyException(CustomExceptionCode customExceptionCode) {
        this.customExceptionCode = customExceptionCode;
    }

    public CustomExceptionCode getCustomExceptionCode() {
        return customExceptionCode;
    }

}
