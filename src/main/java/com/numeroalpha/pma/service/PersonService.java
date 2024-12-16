package com.numeroalpha.pma.service;

import org.springframework.stereotype.Service;

import com.numeroalpha.pma.entity.Person;
import com.numeroalpha.pma.repository.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {
	
	private final PersonRepository personRepository;
	
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	
	public Person getPersonById(int id) {
		return personRepository.findById(id).orElseThrow();
	}

}
