package org.ymini.yschool.dao;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * User: Jeyakaran
 * Date: 17/6/12
 * Time: 4:03 PM
 */
@Embeddable
public class StudentSubjectId implements Serializable {
    @ManyToOne
    private Student student;
    @ManyToOne
    private Subject subject;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || !(obj instanceof StudentSubjectId))
            return false;
        StudentSubjectId that = (StudentSubjectId) obj;
        if (student != null ? !student.equals(that.getStudent()) : that.getStudent() != null)
            return false;
        if (subject != null ? !subject.equals(that.getSubject()) : that.getSubject() != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = (student != null ? student.hashCode() : 0);
        result = 17 * result + (subject != null ? subject.hashCode() : 0);
        return result;
    }
}
