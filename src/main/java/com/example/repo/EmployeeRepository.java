package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No need to write any code for CRUD operations
}
