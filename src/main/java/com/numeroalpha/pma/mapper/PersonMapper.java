package com.numeroalpha.pma.mapper;

import com.numeroalpha.pma.entity.Person;
import com.numeroalpha.pma.requestdto.PersonRequest;
import com.numeroalpha.pma.responsedto.PersonResponse;

public class PersonMapper {
	
	public static Person toPersonEntity(PersonRequest personRequest) {
		Person person = new Person();
		person.setAge(personRequest.getAge());
		person.setName(personRequest.getName());
		
		return person;
	}
	
	public static PersonResponse toPersonResponse(Person person) {
		PersonResponse personResponse = new PersonResponse();
		personResponse.setAge(person.getAge());
		personResponse.setName(person.getName());
		personResponse.setPersonId(person.getPersonId());
		personResponse.setPersonAddressResponse(PersonAddressMapper.toPersonAddressResponse(person.getPersonAddress()));
		
		return personResponse;
	}

}
