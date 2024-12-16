package com.numeroalpha.pma.responsestructure;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class AppResponseStructure<T> {
	
	public static <T> ResponseEntity<T> getResponseEntity(HttpStatus status, T body) {
		return ResponseEntity
				.status(status)
				.body(body);
	}
	
}
