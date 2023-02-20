package com.iablonski.spring.mvc.rest.server.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentIncorrectData> handleException (NoSuchStudentException exception){
        StudentIncorrectData data = new StudentIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<StudentIncorrectData> handleException (Exception exception){
        StudentIncorrectData data = new StudentIncorrectData();
        data.setInfo(exception.getMessage());
        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}
