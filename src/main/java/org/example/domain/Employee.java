package org.example.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EMPLOYEE")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {

    @Id
    @Column(name = "EMPLOYEE_ID", nullable = false)
    private String id;

    @Column(name = "EMPLOYEE_NAME", nullable = false)
    private String name;

    @Column(name = "DEPARTMENT", nullable = false)
    private String department;

    @Column(name = "SALARY", nullable = false)
    private double salary;

}

// Lombok @AllArgsConstructor will generate this constructor
// public Employee(String id, String name, String department, double salary) {
//     this.id = id;
//     this.name = name;
//     this.department = department;
//     thi
