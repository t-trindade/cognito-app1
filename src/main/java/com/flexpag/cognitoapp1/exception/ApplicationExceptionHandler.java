package com.flexpag.cognitoapp1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class ApplicationExceptionHandler {

    @ExceptionHandler(HttpClientErrorException.class)
    public String forbiden(){
        return "Você não possui autorização para acessar esse recurso!";
    }
}
