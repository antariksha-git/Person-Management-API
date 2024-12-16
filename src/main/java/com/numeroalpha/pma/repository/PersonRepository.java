package com.numeroalpha.pma.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.numeroalpha.pma.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

}
