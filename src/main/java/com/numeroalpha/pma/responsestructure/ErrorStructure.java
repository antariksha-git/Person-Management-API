package com.numeroalpha.pma.responsestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ErrorStructure<T> {
	private int status;
	private String message;
	private T data;
	
	public static <T> ErrorStructure<T> getErrorStructure(int status, String message, T data) {
		return new ErrorStructure<>(status, message, data);
	}

}
