package com.numeroalpha.pma.responsestructure;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ResponseStructure<T> {
	private int status;
	private String message;
	private T data;
	
	public static <T> ResponseStructure<T> getResponseStructure(int status, String message, T data) {
		return new ResponseStructure<>(status, message, data);
	}
}
