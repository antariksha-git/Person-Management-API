package com.numeroalpha.pma.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.numeroalpha.pma.exception.PersonNotFoundException;
import com.numeroalpha.pma.responsestructure.AppResponseStructure;
import com.numeroalpha.pma.responsestructure.ErrorStructure;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class PersonExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorStructure<String>> handlePersonNotFoundException(PersonNotFoundException personNotFoundException) {
		log.error("Class: {} | Method: {} | Status Code: {} | Error: {}",
                this.getClass().getName(),
                "handlePersonNotFoundException",
                404,
                personNotFoundException.getMessage(), personNotFoundException);
		
		return AppResponseStructure
				.getResponseEntity(HttpStatus.NOT_FOUND, ErrorStructure
						.getErrorStructure(404, "User not found", personNotFoundException.getMessage()));
	}

}
