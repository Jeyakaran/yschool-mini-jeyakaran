package org.ymini.yschool.managedbean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ymini.yschool.dao.Student;
import org.ymini.yschool.dao.StudentDAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
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
    private Student selectedStudent;
    private String message;
    StudentDAO studentDAO;

    public StudentManagedBean() {
        this.selectedStudent = new Student();
        this.studentDAO = new StudentDAO();

        logger.info("Initiated StudentManagedBean");
    }

    public List<Student> getStudentList() {
        return this.studentDAO.getStudentList();
    }

    public List<Student> getSearchList() {
        if (selectedStudent != null) {
            return this.studentDAO.getStudentList(selectedStudent.getName(), selectedStudent.getGrade());
        }

        return null;
    }

    public void updateStudent() {
        this.studentDAO.updateStudent(this.selectedStudent);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student updated successfully ", null));

        logger.info("Updated Student");
    }

    public void addStudent() {
        this.studentDAO.addStudent(selectedStudent);
        selectedStudent = new Student();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Student added successfully ", null));

        logger.info("Added new Student");
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

    public String removeStudent() {
        this.studentDAO.removeStudent(selectedStudent);
        logger.info("Student removed");
        return "view_student";
    }


}
