package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.model.Person;
import com.northcoders.demospringbootapp.suppliers.PersonSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PersonController {


    @GetMapping("/people")
    public Person getPerson(PersonSupplier personSupplier, @RequestParam(value = "id", defaultValue = "0") String id){
        List<Person> people = personSupplier.supplyPeople();
        return people.get(Integer.parseInt(id));
    }



//    @GetMapping("/people")
//    public List<Person> getPeople(PersonSupplier personSupplier){
//        return personSupplier.supplyPeople();
//    }
}
