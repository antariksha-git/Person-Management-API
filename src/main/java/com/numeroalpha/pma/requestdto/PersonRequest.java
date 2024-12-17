package com.numeroalpha.pma.requestdto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonRequest {
	
	@NotNull(message = "Name cannot be null")
	@NotBlank(message = "Name doesn't contain any character")
	private String name;
	
	@NotNull(message = "Age cannot be null")
	private int age;
	
	@Valid
	private PersonAddressRequest personAddressRequest;
}
