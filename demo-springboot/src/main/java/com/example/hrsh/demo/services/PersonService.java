package com.example.hrsh.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrsh.demo.repos.PersonRepository;
import com.example.hrsh.demo.ents.*;

@Service
public class PersonService {
	 @Autowired
	PersonRepository personRepository;
	 
	 @Autowired
		PersonRepository personRepositoryyy;

	    public List<Person> getAllPersons() {
	        List<Person> persons = new ArrayList<Person>();
	        personRepository.findAll().forEach(person -> persons.add(person));
	        return persons;
	    }

	    public PersonService() {
			
		}

		public Person getPersonById(Long id) {
	        return personRepository.findById( id).get();
	    }

	    public void saveOrUpdate(Person person) {
	        personRepository.save(person);
	    }

	    public void delete(int id) {
	        personRepository.deleteById((long) id);
	    }
}
