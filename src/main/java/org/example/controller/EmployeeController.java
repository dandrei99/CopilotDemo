package org.example.controller;

 import org.example.domain.Employee;
 import org.example.service.EmployeeService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.RequestMapping;

 import java.util.List;

@RestController
public class EmployeeController {

    //inject the service class
    @Autowired
    private EmployeeService employeeService;

    //create simple get mapping endpoint
    @RequestMapping("/employee")
    public String getEmployee(){
        return "Hello Employee";
    }

    //create get mapping endpoint method that will return a list of employees
   @RequestMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.consultAllEmployees();
    }
    //give endpoint for getEmployees method
   //http://localhost:8080/employees




}
