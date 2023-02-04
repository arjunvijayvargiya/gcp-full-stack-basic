package com.example.cruddemo.repositories;

import com.example.cruddemo.entities.Customer;

import com.example.cruddemo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Override
    List<Employee> findAll();
}

