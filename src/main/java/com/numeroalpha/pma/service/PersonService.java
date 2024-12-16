package com.numeroalpha.pma.service;

import org.springframework.stereotype.Service;

import com.numeroalpha.pma.entity.Person;
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
		return PersonMapper
				.toPersonResponse(personRepository
						.save(PersonMapper
								.toPersonEntity(personRequest)));
		
	}
	
	public PersonResponse getPersonById(int id) {
		return personRepository
				.findById(id)
				.map(person -> PersonMapper.toPersonResponse(person))
				.orElseThrow();
	}

}
