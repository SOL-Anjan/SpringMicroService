package com.springboot.learning.demoapp.exceptions;

public class EmailUniquenessException extends RuntimeException {
    public EmailUniquenessException(String message) {
        super(message);
    }
}
