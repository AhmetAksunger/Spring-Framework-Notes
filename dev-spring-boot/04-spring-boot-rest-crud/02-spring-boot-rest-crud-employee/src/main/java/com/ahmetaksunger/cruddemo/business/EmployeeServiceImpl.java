package com.ahmetaksunger.cruddemo.business;

import com.ahmetaksunger.cruddemo.dao.EmployeeDAO;
import com.ahmetaksunger.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {

        var employees = employeeDAO.findAll();

        return employees;
    }
}
