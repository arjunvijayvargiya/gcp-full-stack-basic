package com.example.cruddemo.controllers;

import com.example.cruddemo.entities.Employee;
import com.example.cruddemo.model.EmployeeList;
import com.example.cruddemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @GetMapping("/employees")
    @RolesAllowed("user")
    public ResponseEntity<EmployeeList> getAllEmployees() {
        List<Employee> employeeList = employeeRepository.findAll();
        EmployeeList list = new EmployeeList(employeeList);
        return ResponseEntity.ok()
                .body(list);
    }
}
