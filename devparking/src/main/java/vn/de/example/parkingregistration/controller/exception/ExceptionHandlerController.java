package vn.de.example.parkingregistration.controller.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import vn.de.example.parkingregistration.exception.DataNotFoundException;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(value = { DataNotFoundException.class })
    public String handlDataNotFoundException(Exception e, HttpServletRequest request, HttpServletResponse response) {
        //request.getRequestURI();
        return "Not found data";
    }
}
