package com.manage.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manage.app.entity.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee,Long>{

	public List<Employee> findByName(String name);

}
