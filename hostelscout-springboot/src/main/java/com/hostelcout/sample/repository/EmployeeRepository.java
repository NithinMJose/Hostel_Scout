package com.hostelcout.sample.repository;

import com.hostelcout.sample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Additional query methods can be defined here if needed

}
