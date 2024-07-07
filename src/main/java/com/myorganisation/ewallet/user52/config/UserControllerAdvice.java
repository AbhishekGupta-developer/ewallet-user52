package com.myorganisation.ewallet.user52.config;

import com.myorganisation.ewallet.user52.exception.EwalletUserException;
import com.myorganisation.ewallet.user52.service.resource.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(EwalletUserException.class)
    public ResponseEntity<?> handleEwalletUserException(EwalletUserException ex) {
        ErrorResponse errorResponse = new ErrorResponse();
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put(ex.getType(), ex.getMessage());
        errorResponse.setError(errorMap);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {

        BindingResult result = ex.getBindingResult();
        Map<String, String> errorMap = new HashMap<>();
        result.getFieldErrors().forEach( error ->
                errorMap.put(error.getField(), error.getDefaultMessage())
        );
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setError(errorMap);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
