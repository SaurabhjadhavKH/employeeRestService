package com.employee.rest;


import com.employee.entity.Employee;
import com.employee.exception.EmployeeException;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> allEmployeeList(){
        List<Employee> employeeList = employeeService.findAll();

        return  employeeList;
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findEmployeeById(@PathVariable("employeeId") int id){

        if(id < 0 ){
            throw new EmployeeException("Employee Id Not Valid "+id);
        }
        Employee employee = employeeService.findEmployeeById(id);

        if(employee == null){
            throw  new EmployeeException("Employee Not Found for given id  "+id);
        }
        return employee;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){

        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return  employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeId}")

    public String deleteEmployee(@PathVariable("employeeId") int id){
        return employeeService.deleteEmployee(id);
    }

    @GetMapping("/employees/lastname/{lastName}")
    public List<Employee> employeeByLastName(@PathVariable("lastName") String lastName){
    return employeeService.employeeByLastName(lastName);
    }
}
