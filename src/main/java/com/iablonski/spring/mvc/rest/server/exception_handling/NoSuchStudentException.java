package com.iablonski.spring.mvc.rest.server.exception_handling;

public class NoSuchStudentException extends RuntimeException{
    public NoSuchStudentException(String message) {
        super(message);
    }
}
