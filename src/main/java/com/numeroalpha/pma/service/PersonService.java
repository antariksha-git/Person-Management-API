package com.numeroalpha.pma.service;

import org.springframework.stereotype.Service;

import com.numeroalpha.pma.entity.Person;
import com.numeroalpha.pma.exception.PersonNotFoundException;
import com.numeroalpha.pma.mapper.PersonAddressMapper;
import com.numeroalpha.pma.mapper.PersonMapper;
import com.numeroalpha.pma.repository.PersonRepository;
import com.numeroalpha.pma.requestdto.PersonRequest;
import com.numeroalpha.pma.responsedto.PersonResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {
	
	private final PersonRepository personRepository;
	
	public PersonResponse createPerson(PersonRequest personRequest) {
		
		Person person = PersonMapper.toPersonEntity(personRequest);
		person.setPersonAddress(PersonAddressMapper.toPersonAddressEntity(personRequest.getPersonAddressRequest()));
		return PersonMapper.toPersonResponse(personRepository.save(person));
		
	}
	
	public PersonResponse getPersonById(int id) {
		return personRepository
				.findById(id)
				.map(person -> PersonMapper.toPersonResponse(person))
				.orElseThrow(() -> new PersonNotFoundException(404, "User not found by given id"));
	}

	public PersonResponse deletePersonById(int personId) {
		Person person = personRepository
				.findById(personId)
				.orElseThrow(() -> new PersonNotFoundException(404, "User not found by given id"));
		personRepository.delete(person);
		
		return PersonMapper.toPersonResponse(person);
	}

}
