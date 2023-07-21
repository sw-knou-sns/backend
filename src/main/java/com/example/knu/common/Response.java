package com.example.knu.common;

import lombok.Getter;

@Getter
public class Response<T> {

    private final ResultCode resultCode;
    private final T data;

    public Response(ResultCode resultCode, T data) {
        this.resultCode = resultCode;
        this.data = data;
    }

    public static <T> Response<T> success(T data) {
        return new Response<>(ResultCode.SUCCESS, data);
    }
}