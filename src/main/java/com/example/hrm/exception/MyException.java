package com.example.hrm.exception;

public class MyException extends RuntimeException{

    private CustomExceptionCode customExceptionCode;
    private String message;

    public MyException(CustomExceptionCode customExceptionCode) {
        super(customExceptionCode.getMessage());
        this.customExceptionCode = customExceptionCode;
        this.message = customExceptionCode.getMessage();
    }

    public CustomExceptionCode getCustomExceptionCode() {
        return customExceptionCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
