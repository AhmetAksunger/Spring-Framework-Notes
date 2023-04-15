package com.ahmetaksunger.cruddemo.business;

import com.ahmetaksunger.cruddemo.dao.EmployeeRepository;
import com.ahmetaksunger.cruddemo.entity.Employee;
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

        var employees = employeeRepository.findAll();

        return employees;
    }

    @Override
    public Employee findById(int id) {

        Optional<Employee> employee = employeeRepository.findById(id);

        if(!employee.isPresent()){
            throw new RuntimeException("No user with given id");
        }

        return employee.get();
    }

    @Override
    public Employee add(Employee employee) {

        employee = employeeRepository.save(employee);

        return employee;
    }

    @Override
    public Employee update(Employee employee) {

        employee = employeeRepository.findById(employee.getId()).orElseThrow();

        employee = employeeRepository.save(employee);

        return employee;
    }

    @Override
    public void delete(int id) {

        employeeRepository.deleteById(id);

    }
}
