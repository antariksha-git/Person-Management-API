package com.numeroalpha.pma.mapper;

import com.numeroalpha.pma.entity.Person;
import com.numeroalpha.pma.requestdto.PersonRequest;
import com.numeroalpha.pma.responsedto.PersonResponse;

public class PersonMapper {
	
	public Person toPersonEntity(PersonRequest personRequest) {
		Person person = new Person();
		person.setAge(personRequest.getAge());
		person.setName(personRequest.getName());
		
		return person;
	}
	
	public PersonResponse toPersonResponse(Person person) {
		PersonResponse personResponse = new PersonResponse();
		personResponse.setAge(person.getAge());
		personResponse.setName(person.getName());
		personResponse.setPersonId(person.getPersonId());
		
		return personResponse;
	}

}
