package org.example.controller;

 import org.springframework.web.bind.annotation.RestController;
 import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmployeeController {

    //create simple get mapping endpoint
    @RequestMapping("/employee")
    public String getEmployee(){
        return "Hello Employee";
    }


     //how will the ednpoint look in postman for this method?
    //http://localhost:8080/employee


}
