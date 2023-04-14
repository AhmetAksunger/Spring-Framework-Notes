package com.ahmetaksunger.cruddemo.dao;

import com.ahmetaksunger.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{

    //field for entity manager
    private EntityManager entityManager;

    // inject entity manager
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {

        entityManager.persist(student);

    }

    @Override
    public Student findById(Integer id) {

        Student student = entityManager.find(Student.class,id);
        return student;
    }

    @Override
    public List<Student> findAll(){

        //create a query

        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student order by lastName", Student.class);

        return theQuery.getResultList();

    }

    @Override
    public List<Student> findByLastName(String lastName) {

        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName = :lastName", Student.class);

        // set query parameters
        theQuery.setParameter("lastName",lastName);


        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {

        entityManager.merge(student);

    }

    @Override
    @Transactional
    public void updateAll() {

        int numOfRowAffected = entityManager.createQuery("UPDATE Student SET lastName = 'Mehmet'").executeUpdate();

        System.out.println(numOfRowAffected + " rows has been affected");
    }

}
