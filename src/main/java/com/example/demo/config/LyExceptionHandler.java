package com.example.demo.config;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LyExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String handler(Exception e) {
        return "some error in lyExceptionHandler: " + e.getMessage();
    }
}
