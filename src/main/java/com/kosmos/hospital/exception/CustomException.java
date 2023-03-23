package com.kosmos.hospital.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {
    private HttpStatus code;
    private String msg;

    public CustomException(String msg, HttpStatus status) {
        super(msg);
        this.msg = msg;
        this.code = status;
    }

    public HttpStatus getCode() {
        return code;
    }

}
