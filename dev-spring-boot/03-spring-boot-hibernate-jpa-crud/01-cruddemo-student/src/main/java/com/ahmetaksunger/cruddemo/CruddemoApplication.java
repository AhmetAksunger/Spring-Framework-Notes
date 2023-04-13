package com.ahmetaksunger.cruddemo;

import com.ahmetaksunger.cruddemo.dao.StudentDAO;
import com.ahmetaksunger.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			createStudent(studentDAO);

		};
	}

	private void createStudent(StudentDAO studentDAO){

		// creating a student object

		Student student = new Student("Ahmet","Aksunger","ahmet@gmail.com");

		// saving the student
		studentDAO.save(student);

		// displaying the information of the student

		System.out.println(student.toString());

	}

}
