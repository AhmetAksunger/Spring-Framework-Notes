package com.ahmetaksunger.cruddemo.rest;

import com.ahmetaksunger.cruddemo.business.EmployeeService;
import com.ahmetaksunger.cruddemo.entity.Employee;
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
    public List<Employee> findAll(){

        return employeeService.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){

        return employeeService.findById(id);
    }

    @PostMapping("/employees")
    public Employee add(@RequestBody Employee employee){

        employee.setId(0);
        employee = employeeService.add(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){

        employee = employeeService.update(employee);

        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable int id){
        employeeService.delete(id);
    }
}
