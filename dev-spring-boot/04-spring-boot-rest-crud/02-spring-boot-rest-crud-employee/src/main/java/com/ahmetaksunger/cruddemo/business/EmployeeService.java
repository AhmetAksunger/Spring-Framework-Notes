package com.ahmetaksunger.cruddemo.business;

import com.ahmetaksunger.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

}
