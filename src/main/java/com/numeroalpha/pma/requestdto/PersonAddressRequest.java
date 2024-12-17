package com.numeroalpha.pma.requestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonAddressRequest {
	@NotNull(message = "Street cannot be null")
	@NotBlank(message = "Street doesn't contain any character")
	private String street;
	
	@NotNull(message = "State cannot be null")
	@NotBlank(message = "State doesn't contain any character")
	private String state;
}
