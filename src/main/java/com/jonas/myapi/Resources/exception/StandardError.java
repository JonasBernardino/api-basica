package com.jonas.myapi.Resources.exception;

import lombok.Data;

@Data
public class StandardError {

    private Integer status;
    private Long timestamp;
    private String message;

    public StandardError(Integer status, Long timestamp, String message) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
    }

}
