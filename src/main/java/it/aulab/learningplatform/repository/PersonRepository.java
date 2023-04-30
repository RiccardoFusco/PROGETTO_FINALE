package it.aulab.learningplatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.aulab.learningplatform.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
