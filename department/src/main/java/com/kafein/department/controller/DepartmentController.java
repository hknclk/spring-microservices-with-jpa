package com.kafein.department.controller;

import com.kafein.department.model.Department;
import com.kafein.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @GetMapping("/hello")
    public String getHello(){
        return "Hello From Department Service!";
    }

    @GetMapping
    public List<Department> list(){
        return repository.findAll();
    }

    @PostMapping
    public void post(@RequestBody Department request) {
        repository.save(request);
    }

    @PostMapping("/searchByName")
    public Department getName(String name) {
        return repository.findByName(name);
    }

    @PostConstruct
    private void initData() {
        repository.save(new Department("Matematik"));
        repository.save(new Department("Türkçe"));
    }
}
