package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee);

    String deleteEmployee(int id);

    Employee findEmployeeById(int id);

    List<Employee> employeeByLastName(String lastName);
}
