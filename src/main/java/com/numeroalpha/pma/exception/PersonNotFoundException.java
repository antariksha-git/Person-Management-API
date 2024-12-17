package com.numeroalpha.pma.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@AllArgsConstructor
@Getter
@Setter
public class PersonNotFoundException extends RuntimeException {
	private int status;
	private String message;
}
