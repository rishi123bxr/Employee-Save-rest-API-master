package com.manage.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.manage.app.entity.Employee;
import com.manage.app.service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/")
    public String sayHi() { 
    	return "this Application Run";
    	}
    
    // here we can get all the list of employee
    
    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
    	return employeeService.getAllEmployee();
    }
    
    // here we can call or get a employee by name
    
    @GetMapping("/employee/{name}")
    public List<Employee> getEmployeesByName( @PathVariable String name) {
        return employeeService.getEmployeesByName(name);
    }
    	
    // here we can post a employee
    
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

  
}
