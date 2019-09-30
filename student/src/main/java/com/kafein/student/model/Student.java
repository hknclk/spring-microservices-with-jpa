package com.kafein.student.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private long departmentId;

    public Student() {}

    public Student(String name, long departmentId) {
        this.name = name;
        this.departmentId = departmentId;
    }
}
