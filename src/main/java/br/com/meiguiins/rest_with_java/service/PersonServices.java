package br.com.meiguiins.rest_with_java.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import br.com.meiguiins.rest_with_java.exception.ResourceNotFoundException;
import br.com.meiguiins.rest_with_java.model.Person;
import br.com.meiguiins.rest_with_java.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;



@Service
public class PersonServices  {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger =  LoggerFactory.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository repository;



    public List<Person> findAll(){

        logger.info("Finding all People!");

        return repository.findAll();
    }
    public Person findById(Long id) {
        logger.info("Finding one Person!");

        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
    }

    public Person create(Person person){
        logger.info("Creating one Person!");

        return repository.save(person);
    }

    public Person update(Person person){
        logger.info("Updating one person!");

        Person entity = repository.findById(person.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAdrress(person.getAdrress());
        entity.setGender(person.getGender());

        return repository.save(person);
    }

    public void delete(Long id){

        logger.info("Deleting one person!!");

        Person entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

        repository.delete(entity);
    }

}
