package com.employee.repo;

import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query("SELECT e from Employee e WHERE e.lastName=:lastName")
    List<Employee> findByLastName(@Param("lastName") String lastName);
}
