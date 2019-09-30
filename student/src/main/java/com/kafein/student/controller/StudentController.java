package com.kafein.student.controller;

import com.kafein.student.model.Student;
import com.kafein.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello From Student Service!";
    }

    @GetMapping
    public List<Student> list(){
        return repository.findAll();
    }

    @PostMapping
    public void post(@RequestBody Student request) {
        repository.save(request);
    }

    @PostMapping("/searchByName")
    public Student getName(String name) {
        return repository.findByName(name);
    }

    @PostConstruct
    private void initData() {
        repository.save(new Student("Hakan", 1));
        repository.save(new Student("Arda", 2));
    }
}
