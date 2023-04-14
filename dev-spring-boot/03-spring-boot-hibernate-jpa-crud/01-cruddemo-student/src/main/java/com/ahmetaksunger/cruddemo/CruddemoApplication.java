package com.ahmetaksunger.cruddemo;

import com.ahmetaksunger.cruddemo.dao.StudentDAO;
import com.ahmetaksunger.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {
			//createStudent(studentDAO);

			createMultipleStudents(studentDAO);

			//readStudent(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//updateAllStudent(studentDAO);

			//deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {

		studentDAO.delete(2);

	}

	private void updateAllStudent(StudentDAO studentDAO) {

		studentDAO.updateAll();

	}

	private void updateStudent(StudentDAO studentDAO) {

		int studentId = 2;
		Student student = studentDAO.findById(2);

		student.setFirstName("Ali");
		student.setLastName("Keskin");

		studentDAO.update(student);

	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> studentList = studentDAO.findByLastName("Smith");

		for(Student student:studentList){
			System.out.println(student.toString());
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		List<Student> studentList = studentDAO.findAll();

		for(Student student : studentList){
			System.out.println(student.toString());
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		Student student = studentDAO.findById(4);

		System.out.println(student.toString());

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		studentDAO.save(new Student("John","Martinez","john@gmail.com"));
		studentDAO.save(new Student("Alice", "Johnson", "alice.johnson@example.com"));
		studentDAO.save(new Student("Michael", "Smith", "michael.smith@studentmail.com"));
		studentDAO.save(new Student("Michael", "Smith", "michael.smith@studentmail.com"));
		studentDAO.save(new Student("David", "Brown", "david.brown@example.com"));

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
