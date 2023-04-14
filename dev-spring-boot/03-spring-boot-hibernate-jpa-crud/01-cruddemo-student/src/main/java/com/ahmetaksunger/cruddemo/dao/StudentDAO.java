package com.ahmetaksunger.cruddemo.dao;

import com.ahmetaksunger.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String lastName);

    void update(Student student);

    void updateAll();

    void delete(Integer id);
}
