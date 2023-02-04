package com.example.cruddemo.model;

import com.example.cruddemo.entities.Employee;

import java.util.List;

public class EmployeeList {

    List<Employee> empList;

    public EmployeeList(List<Employee> empList) {
        this.empList = empList;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }
}
