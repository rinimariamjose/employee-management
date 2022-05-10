package com.spring.services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.services.entites.Employee;

@Repository
public interface EmployeRepository extends JpaRepository<Employee,Long> {
    
    Employee findEmployeByName(String name);
}
