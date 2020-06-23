package com.parkhuiwo0.ExceptionDemo.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse<T> {
    private T data;
    private ErrorResponse error;

    public ApiResponse() {
        this.data = (T) EmptyObject.OBJECT;
        this.error = new ErrorResponse();
    }

    public ApiResponse(T data) {
        if (data == null)  this.data = (T) EmptyObject.OBJECT;
        else this.data = data;
        this.error = new ErrorResponse();
    }

    public ApiResponse(ErrorResponse error) {
        this.data = (T) EmptyObject.OBJECT;
        this.error = error;
    }
}
