package com.numeroalpha.pma.responsedto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonAddressResponse {
	private int addressId;
	private String street;
	private String state;
}
