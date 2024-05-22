package org.example.service;

import org.springframework.stereotype.Service;
import org.example.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.example.infra.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> consultAllEmployees(){
        return employeeRepository.findAll();
    }





}
