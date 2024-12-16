package com.numeroalpha.pma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.numeroalpha.pma.entity.Person;
import com.numeroalpha.pma.requestdto.PersonRequest;
import com.numeroalpha.pma.responsedto.PersonResponse;
import com.numeroalpha.pma.service.PersonService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
public class PersonController {
	
	private final PersonService personService;
	
	@PostMapping
	public PersonResponse createPerson(@RequestBody PersonRequest personRequest) {
		return personService.createPerson(personRequest);
	}
	
	@GetMapping("/{personId}")
	public PersonResponse getPersonById(@PathVariable int personId) {
		return personService.getPersonById(personId);
	}

}
