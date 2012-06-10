package org.ymini.yschool.dao;

import org.hibernate.Criteria;

import javax.persistence.*;
import java.util.List;

/**
 * Student DAO class
 * User: Jeyakaran
 * Date: 19/5/12
 * Time: 7:40 AM
 */
public class StudentDAO {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public StudentDAO() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("yschool-mini-mysql");
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    /*
    * method returns only active Students
    */
    public List<Student> getStudentList() {
        Query query = entityManager.createQuery("select stu from Student stu where stu.active = :activeValue");
        query.setParameter("activeValue", true);
        return query.getResultList();
    }

    /*
    * method returns only active Students
    */
    public List<Student> getStudentList(final String name, final int grade) {
        Query query = entityManager.createQuery("select stu from Student stu where stu.active = :activeValue AND stu.name = :nameValue AND stu.grade = :gradeValue");
        query.setParameter("activeValue", true);
        query.setParameter("nameValue", name);
        query.setParameter("gradeValue", grade);
        return query.getResultList();
    }

    public boolean addStudent(final Student student) {
        if (student == null) {
            return false;
        }
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        return true;
    }

    public boolean updateStudent(final Student student) {
        if (student == null) {
            return false;
        }
        entityManager.getTransaction().begin();
        Student persistStudent = entityManager.find(Student.class, student.getsId());
        if (persistStudent == null) {
            return false;
        } else {
            persistStudent.setName(student.getName());
            persistStudent.setAddress(student.getAddress());
            persistStudent.setGrade(student.getGrade());
            persistStudent.setParentName(student.getParentName());
            entityManager.getTransaction().commit();
        }
        return true;
    }

    public boolean removeStudent(final Student student) {
        if (student == null) {
            return false;
        }

        entityManager.getTransaction().begin();
        Student persistStudent = entityManager.find(Student.class, student.getsId());
        if (persistStudent == null) {
            return false;
        } else {
            persistStudent.setActive(false);
            entityManager.getTransaction().commit();
        }
        return true;
    }
}
