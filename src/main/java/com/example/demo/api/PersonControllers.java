package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonControllers {
    private  final PersonServices personServices;
    @Autowired
    public PersonControllers(PersonServices personServices) {
        this.personServices = personServices;
    }
    @PostMapping
    public void addPerson(@RequestBody Person person){
        personServices.addPerson(person);
    }
    @GetMapping(path="{id}")
    public Person getPersonById(@PathVariable ("id") UUID id){
        return personServices.getPersonById(id).orElse(null);
    }
    @GetMapping
    public List<Person> getallPeople(){
        return personServices.getallPeople();
    }

    @DeleteMapping(path= "{id}")
    public void deletePerson(@PathVariable("id") UUID id){
        personServices.delelePerson(id);
    }
    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id,@RequestBody Person person){
        personServices.updatePerson(id,person);
    }

}

