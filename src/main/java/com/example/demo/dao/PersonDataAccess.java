package com.example.demo.dao;

import com.example.demo.Repo.UserRepo;
import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@Repository("postgres")

public class PersonDataAccess implements PersonDao {
    private  final UserRepo userRepo;
    public PersonDataAccess(UserRepo userRepo) {
        this.userRepo = userRepo;
    }


    @Override
    public int insertPerson(UUID id, Person person){
        userRepo.save(new Person(id,person.getName(),person.getPhonenumber()));
        return 1;
    }
    @Override
    public List<Person> selectAllPeople(){
        return userRepo.findAll();

    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return userRepo.findById(id);
    }

    @Override
    public int deletePersonbyid(UUID id) {
        if (userRepo.existsById(id)){
            userRepo.deleteById(id);
            return 1;
        }
        else{
           return 0;
        }
    }

    @Override
    public int updatePersonById(UUID id, Person person_update) {
        return userRepo.findById(id)
                .map(person -> {
                        Person updatedPerson=new Person(id,person_update.getName(),person_update.getPhonenumber());
                        userRepo.save(updatedPerson);
                        return 1;

                }

                ).orElse(null);
    }
}

