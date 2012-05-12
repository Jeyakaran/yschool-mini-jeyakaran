package org.ymini.yschool.data;

/**
 * Student model class
 * User: Jeyakaran
 * Date: 12/5/12
 * Time: 7:41 AM
 */
public class Student {
    String name;
    String address;
    int grade;
    String parentName;

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
}
