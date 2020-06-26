package com.parkhuiwo0.ExceptionDemo.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.parkhuiwo0.ExceptionDemo.exception.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private LocalDateTime timestamp;

    private int status;

    private String code;

    private String message;

    public ErrorResponse(ErrorCode errorCode) {
        this.timestamp = LocalDateTime.now();
        this.status = errorCode.getStatus();
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }
}
