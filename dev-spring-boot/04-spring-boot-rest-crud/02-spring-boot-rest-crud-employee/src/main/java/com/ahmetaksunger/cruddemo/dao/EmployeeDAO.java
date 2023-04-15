package com.ahmetaksunger.cruddemo.dao;

import com.ahmetaksunger.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
