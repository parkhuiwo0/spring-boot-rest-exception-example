package com.parkhuiwo0.ExceptionDemo.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {

    METHOD_NOT_ALLOWED(405, "C001", "허용되지 않은 메소드 방식입니다."),
    ENTITY_NOT_FOUND(400, "C002", "찾으려는 엔티티가 없습니다.");

    private int status;
    private String code;
    private String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
