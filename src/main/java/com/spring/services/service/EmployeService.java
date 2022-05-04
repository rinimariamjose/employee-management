package com.spring.services.service;

import java.util.List;

import com.spring.services.entites.Employee;
import com.spring.services.repositories.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;
    public List<Employee> getAllEmployees(){
        return employeRepository.findAll();
    }
    public Employee createEmploye(Employee employee){
        return employeRepository.save(employee);
    }
}
