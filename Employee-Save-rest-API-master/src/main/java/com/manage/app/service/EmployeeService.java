package com.manage.app.service;

import java.util.List;

import com.manage.app.entity.Employee;

public interface EmployeeService {
  public Employee saveEmployee(Employee employee);
  public List<Employee> getEmployeesByName(String name);
  public List<Employee> getAllEmployee();
}
