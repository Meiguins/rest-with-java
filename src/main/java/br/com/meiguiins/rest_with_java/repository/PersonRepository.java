package br.com.meiguiins.rest_with_java.repository;

import br.com.meiguiins.rest_with_java.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
