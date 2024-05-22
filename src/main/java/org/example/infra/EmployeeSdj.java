package org.example.infra;

import org.example.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeSdj extends JpaRepository<Employee, String> {
}
