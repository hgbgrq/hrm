package com.example.hrm.exception;

public enum CustomExceptionCode {

    SUCCESS(200, "성공했습니다."),
    ZERO_FAIL(500, "존재하지 않는 숫자 : 0"),
    TWO_FAIL(500, "존재하지 않는 숫자 : 2"),
    THREE_FAIL(500, "존재하지 않는 숫자 : 3");

    private final int status;
    private final String message;

    CustomExceptionCode(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
