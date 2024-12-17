package com.numeroalpha.pma.responsestructure;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorResponse {

	private int statusCode;
	private String message;
	private LocalDateTime timestamp;
	private Map<String, String> errors;

}
