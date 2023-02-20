package com.example.hrm.exception;

public enum CustomExceptionCode {

    SUCCESS(200, "성공했습니다."),
    ZERO_FAIL(400, "0 입니다."),
    TWO_FAIL(400, "2 입니다."),
    THREE_FAIL(400, "3 입니다.");

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
