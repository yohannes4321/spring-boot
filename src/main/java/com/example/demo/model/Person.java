package com.example.demo.model;


import jakarta.persistence.*;

import java.util.UUID;


@Entity
public class Person {
    @Id
    private UUID id;

    private String name;
    private String phonenumber;

    public Person() {
        // JPA requires a no-arg constructor
    }

    public Person(UUID id, String name,String phonenumber) {
        this.id = id;
        this.name = name;
        this.phonenumber=phonenumber;


    }



    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public String getPhonenumber() {
        return phonenumber;
    }

}
