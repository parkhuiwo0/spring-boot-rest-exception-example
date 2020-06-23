package com.parkhuiwo0.ExceptionDemo.api;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class EmptyObject {
    public static EmptyObject OBJECT = new EmptyObject();
}
