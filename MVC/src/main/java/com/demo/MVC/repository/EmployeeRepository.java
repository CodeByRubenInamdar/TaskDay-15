package com.demo.MVC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.MVC.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
