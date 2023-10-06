package com.nisum.prueba.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class InvalidEmailAdvice {

  @ResponseBody
  @ExceptionHandler(InvalidEmailException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String invalidEmailHandler(InvalidEmailException ex) {
    return ex.getMessage();
  }
}