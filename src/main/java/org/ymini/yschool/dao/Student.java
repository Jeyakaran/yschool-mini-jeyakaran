package org.ymini.yschool.dao;


import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Student entity class
 * User: Jeyakaran
 * Date: 19/5/12
 * Time: 7:41 AM
 */
@Entity
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "student_sId")
    private int sId;
    @Column(name = "student_name")
    private String name;
    @Column(name = "student_address")
    private String address;
    @Column(name = "student_grade")
    private int grade;
    @Column(name = "student_parentName")
    private String parentName;
    @Column(columnDefinition = "TINYINT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private boolean active = true;

    public Student() {
    }

    public Student(String name, String address, int grade, String parentName) {
        this.name = name;
        this.address = address;
        this.grade = grade;
        this.parentName = parentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
