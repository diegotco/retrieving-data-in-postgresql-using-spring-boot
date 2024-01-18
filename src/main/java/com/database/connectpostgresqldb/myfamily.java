package com.database.connectpostgresqldb;

import jakarta.persistence.*;


@Entity
public class myfamily {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private int age;
    private String relationship;

    // Constructors, getters, and setters

    public myfamily() {
        // Default constructor
    }

    public myfamily(String name, String lastName, int age, String relationship) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.relationship = relationship;
    }

    // Getter and Setter methods

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
