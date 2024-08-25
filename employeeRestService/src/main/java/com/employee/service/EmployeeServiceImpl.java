package com.employee.service;


import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }


    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public Employee updateEmployee(Employee employee) {
        Employee emp = employeeRepository.save(employee);
        return emp;
    }


    @Override
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Employee Deleted with Id :"+id;
    }

    @Override
    public Employee findEmployeeById(int id) {
        Optional<Employee> byId = employeeRepository.findById(id);
        Employee employee = null;
        if (byId !=null){
            return employee =byId.get();
        }
        return employee;
    }

    @Override
    public List<Employee> employeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }
}
