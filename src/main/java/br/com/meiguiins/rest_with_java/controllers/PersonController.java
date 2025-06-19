package br.com.meiguiins.rest_with_java.controllers;

import br.com.meiguiins.rest_with_java.request.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonServices service;


}
