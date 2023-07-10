package com.greatlearning.employeemgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.employeemgmt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
