package com.ahmetaksunger.cruddemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="employee")
@Data
@NoArgsConstructor
public class Employee {

    //fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="first_name")

    private String firstName;
    @Column(name="last_name")

    private String lastName;

    @Column(name="email")

    private String email;

    @Autowired
    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

}
