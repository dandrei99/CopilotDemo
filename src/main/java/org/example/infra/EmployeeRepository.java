package org.example.infra;

//import org.example.domain.Employee;
import org.example.domain.Employee;
//import java.util.List;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    @Autowired
    private EmployeeSdj employeeSdj;

    //public Employee findById(String employeeId) {
    //    return null;
    //}

    //public List<Employee> findAll() {
    //    return null;
    //}

    public Employee findById(String employeeId) {
        return null;
    }

    public List<Employee> findAll() {

        return employeeSdj.findAll();
    }
}
