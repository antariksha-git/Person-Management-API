package com.numeroalpha.pma.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.numeroalpha.pma.requestdto.PersonRequest;
import com.numeroalpha.pma.responsedto.PersonResponse;
import com.numeroalpha.pma.responsestructure.AppResponseStructure;
import com.numeroalpha.pma.responsestructure.ResponseStructure;
import com.numeroalpha.pma.service.PersonService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("api/person")
@AllArgsConstructor
@Slf4j
public class PersonController {
	
	private final PersonService personService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<PersonResponse>> createPerson(@RequestBody @Valid PersonRequest personRequest) {
		log.info("Received request for creating person");
		return AppResponseStructure
				.getResponseEntity(HttpStatus.CREATED, 
						new ResponseStructure<>(201, "User created successfully!", personService.createPerson(personRequest)));
	}
	
	@GetMapping("/{personId}")
	public ResponseEntity<ResponseStructure<PersonResponse>> getPersonById(@PathVariable int personId) {
		log.info("Received request to get person with the id {}", personId);
		return AppResponseStructure
				.getResponseEntity(HttpStatus.OK, 
						new ResponseStructure<>(200, "User found successfully!", personService.getPersonById(personId)));
	}
	
	@DeleteMapping("/{personId}")
	public ResponseEntity<ResponseStructure<PersonResponse>> deletePersonById(@PathVariable int personId) {
		log.info("Received request to delete person with the id {}", personId);
		return AppResponseStructure
				.getResponseEntity(HttpStatus.OK, 
						new ResponseStructure<>(200, "Deleted user successfully!", personService.deletePersonById(personId)));
	}

}
