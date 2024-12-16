package com.numeroalpha.pma.exception;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonNotFoundException extends RuntimeException {
	private int status;
	private String message;
}
