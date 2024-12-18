package com.numeroalpha.pma.mapper;

import com.numeroalpha.pma.entity.PersonAddress;
import com.numeroalpha.pma.requestdto.PersonAddressRequest;
import com.numeroalpha.pma.responsedto.PersonAddressResponse;

public class PersonAddressMapper {
	
	public static PersonAddress toPersonAddressEntity(PersonAddressRequest personAddressRequest) {
		PersonAddress personAddress = new PersonAddress();
		personAddress.setState(personAddressRequest.getState());
		personAddress.setStreet(personAddressRequest.getStreet());
		
		return personAddress;
	}
	
	public static PersonAddressResponse toPersonAddressResponse(PersonAddress personAddress) {
		PersonAddressResponse personAddressResponse = new PersonAddressResponse();
		personAddressResponse.setAddressId(personAddress.getAddressId());
		personAddressResponse.setState(personAddress.getState());
		personAddressResponse.setStreet(personAddress.getStreet());
		
		return personAddressResponse;
	}

}
