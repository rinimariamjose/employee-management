package com.spring.services.controller;

import java.util.List;

import com.spring.services.entites.Employee;
import com.spring.services.service.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeController {
    @Autowired
    private EmployeService employeService;
    @GetMapping("/employes")
    public List<Employee> getAllEmployees(){
        return employeService.getAllEmployees();
    }

  @PostMapping("/employes")
    public Employee createEmploye(@RequestBody Employee employee){
        return employeService.createEmploye(employee);
    }
    
}
