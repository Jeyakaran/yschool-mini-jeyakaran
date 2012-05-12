package org.ymini.yschool.managedbean;

import org.ymini.yschool.data.Student;
import org.ymini.yschool.data.StudentDB;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;


/**
 * Student ManagedBean class
 * User: Jeyakaran
 * Date: 12/5/12
 * Time: 1:23 PM
 */
@ManagedBean(name = "studentManagedBean")
@RequestScoped
public class StudentManagedBean implements Serializable {
    private List<Student> students;
    private Student selectedStudent;
    private String message;

    public StudentManagedBean() {
        students = StudentDB.getStudentDb();
        selectedStudent = new Student();
    }

    public void updateStudent()
    {
        StudentDB.updateStudent(selectedStudent);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student updated successfully ",  null));
    }

    public void addStudent()
    {
        StudentDB.addStudent(selectedStudent);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student added successfully ",  null));
    }
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }

    public void setSelectedStudent(Student selectedStudent) {
        this.selectedStudent = selectedStudent;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
