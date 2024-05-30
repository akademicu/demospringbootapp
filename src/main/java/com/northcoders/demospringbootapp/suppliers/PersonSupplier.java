package com.northcoders.demospringbootapp.suppliers;

import com.northcoders.demospringbootapp.model.Person;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PersonSupplier {

    public List<Person> supplyPeople() {
        Person scott = new Person("Scott Stirling", 28, "sfsfsd", "Glasgow", "Paella");
        Person elly = new Person("Elly Cordiner", 27, "fdsf", "Huddersfield", "katsu curry");

        return List.of(scott, elly);
    }
}
