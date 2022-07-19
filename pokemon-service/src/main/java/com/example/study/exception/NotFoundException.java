package com.example.study.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiException {
  private static String message = "Pokémon com id passado não existe!";
  
  public NotFoundException() {
    super(message);
  }
  
  public NotFoundException(String message) {
    super(message);
    NotFoundException.message = message;
  }
  
  @Override
  public Long getCode() {
    return 404L;
  }
  
  @Override
  public String getMessage() {
    return message;
  }
  
  @Override
  public HttpStatus getHttpStatus() {
    return HttpStatus.NOT_FOUND;
  }
}