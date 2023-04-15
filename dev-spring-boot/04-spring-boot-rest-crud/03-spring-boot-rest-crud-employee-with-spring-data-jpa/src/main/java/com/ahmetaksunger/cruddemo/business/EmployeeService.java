package com.ahmetaksunger.cruddemo.business;

import com.ahmetaksunger.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee add(Employee employee);

    Employee update(Employee employee);

    void delete(int id);

}
