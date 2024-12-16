package com.numeroalpha.pma.exceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.numeroalpha.pma.exception.PersonNotFoundException;

@RestControllerAdvice
public class PersonExceptionHandler {
	
	@ExceptionHandler
	public String handlePersonNotFoundException(PersonNotFoundException personNotFoundException) {
		return "User not found";
	}

}
