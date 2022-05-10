package com.spring.services.service;

import java.util.List;
import java.util.Optional;

import com.spring.services.entites.Employee;
import com.spring.services.repositories.EmployeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeService {
    @Autowired
    private EmployeRepository employeRepository;
    
    //getAllEmployee method
    public List<Employee> getAllEmployees(){
        return employeRepository.findAll();
    }
    
    //createEmployee Method
    public Employee createEmploye(Employee employee){
        return employeRepository.save(employee);
    }

    //getEmployeeById
    public Optional<Employee> getEmployeById(Long id){
    Optional<Employee> employee = employeRepository.findById(id);
    return employee;
    }
    //updateEmployeById
    public Employee updateEmployeById(Long id,Employee employee){
        employee.setId(id);
        return employeRepository.save(employee);
    }
    //deleteEmployeById
    public void deleteEmployeById(Long id){
        if(employeRepository.findById(id).isPresent()){
            employeRepository.deleteById(id);
        }
    }


    //getEmployeByName
    public Employee getEmployeByName(String name){
        return employeRepository.findEmployeByName(name);
    }
}
