package br.com.meiguiins.rest_with_java.request;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices  {

    private final AtomicLong counter = new AtomicLong();

}
