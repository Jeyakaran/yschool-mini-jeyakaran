package org.ymini.yschool.managedbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private static final Logger logger = LoggerFactory.getLogger(StudentManagedBean.class);
    private List<Student> students;
    private Student selectedStudent;
    private String message;

    public StudentManagedBean() {
        students = StudentDB.getStudentDb();
        selectedStudent = new Student();

        logger.info("Initiated StudentManagedBean");
    }

    public void updateStudent()
    {
        StudentDB.updateStudent(selectedStudent);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student updated successfully ",  null));

        logger.info("Updated Student");
    }

    public void addStudent()
    {
        StudentDB.addStudent(selectedStudent);
        selectedStudent = new Student();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student added successfully ",  null));

        logger.info("Added new Student");
    }

    public void deleteStudent()
    {
        StudentDB.deleteStudent(selectedStudent);
        selectedStudent = new Student();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student deleted successfully ",  null));

        logger.info("Deleted Student");
    }
    public void clear()
    {
        this.selectedStudent.clear();
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
