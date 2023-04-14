package com.ahmetaksunger.demo.rest;

import com.ahmetaksunger.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students = new ArrayList<>();

    @PostConstruct
    public void loadData(){
        students.add(new Student("Ahmet","Aksünger"));
        students.add(new Student("Mehmet","Aksünger"));
        students.add(new Student("Ali","Aksünger"));
        students.add(new Student("Necati","Aksünger"));


    }
    @GetMapping("/students")
    public List<Student> getStudents(){

        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        return students.get(studentId);
    }

}
