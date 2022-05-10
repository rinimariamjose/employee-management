package com.spring.services.controller;

import java.util.List;
import java.util.Optional;

import com.spring.services.entites.Employee;
import com.spring.services.service.EmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeController {
    @Autowired
    private EmployeService employeService;

    //getAllEmployee
    @GetMapping("/employes")
    public List<Employee> getAllEmployees(){
        return employeService.getAllEmployees();
    }
    
    //createEmployee
  @PostMapping("/employes")
    public Employee createEmploye(@RequestBody Employee employee){
        return employeService.createEmploye(employee);
    }
    
   //getEmployeById
    @GetMapping("/employes/{id}")
   public Optional<Employee> getEmployeById(@PathVariable("id") Long id){
       return employeService.getEmployeById(id);
   }

   //updateEmployeById
   @PutMapping("/employes/{id}")
   public Employee updateEmployeById(@PathVariable("id") Long id, @RequestBody Employee employee){
       return employeService.updateEmployeById(id, employee);
   }

   //deleteEmployeById
   @DeleteMapping("/employes/{id}")
   public void deleteEmployeById(@PathVariable("id")Long id){
       employeService.deleteEmployeById(id);

       
   }

   //getEmployeName
   @GetMapping("/employes/byname/{name}")
   public Employee getEmployeByName(@PathVariable("name") String name){
       return employeService.getEmployeByName(name);
   }
}
