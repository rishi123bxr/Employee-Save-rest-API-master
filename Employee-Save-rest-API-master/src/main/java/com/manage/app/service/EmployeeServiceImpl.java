package com.manage.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.app.entity.Employee;
import com.manage.app.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getEmployeesByName(String name) {
        return employeeRepository.findByName(name);
    }

	

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	
}
