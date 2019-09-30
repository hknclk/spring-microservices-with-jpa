package com.kafein.department.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue
    private long id;
    private String name;

    public Department() {}

    public Department(String name) {
        this.name = name;
    }
}
