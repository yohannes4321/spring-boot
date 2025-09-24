package com.example.demo.services;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonServices {
    private final PersonDao personDao;
    @Autowired
    public PersonServices(@Qualifier("postgres") PersonDao personDao){
        this.personDao=personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }
    public List<Person> getallPeople(){
        return personDao.selectAllPeople();
    }
    public Optional<Person> getPersonById(UUID id){
        return personDao.selectPersonById(id);
    }
    public void updatePerson(UUID id,Person person){
        personDao.updatePersonById(id,person);
    }
    public void delelePerson(UUID id){
        personDao.deletePersonbyid(id);
    }

}
