package com.cjss.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

public class IdNotFoundException extends RuntimeException{
    public IdNotFoundException(String msg){
        super(msg);
    }
}
