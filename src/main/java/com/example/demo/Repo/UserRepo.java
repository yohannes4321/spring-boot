package com.example.demo.Repo;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepo extends JpaRepository<Person, UUID>{
}
